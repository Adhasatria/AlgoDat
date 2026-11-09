param(
    [Parameter(Mandatory = $true)]
    [string]$SourceFile
)

$ErrorActionPreference = "Stop"
$repositoryRoot = Split-Path -Parent $PSScriptRoot
$assignmentRoot = Join-Path $repositoryRoot "AlgoDat Assignment"
$sourcePath = (Resolve-Path -LiteralPath $SourceFile).Path

if (-not $sourcePath.StartsWith($assignmentRoot, [StringComparison]::OrdinalIgnoreCase)) {
    throw "File Java harus berada di dalam folder AlgoDat Assignment."
}

$javaFiles = Get-ChildItem -Path $assignmentRoot -Recurse -Filter "*.java" |
    ForEach-Object { $_.FullName }

if (-not $javaFiles) {
    throw "Tidak ditemukan file Java di folder AlgoDat Assignment."
}

$packageMatch = [regex]::Match(
    (Get-Content -LiteralPath $sourcePath -Raw),
    '(?m)^\s*package\s+([A-Za-z_]\w*(?:\.[A-Za-z_]\w*)*)\s*;'
)
$className = [IO.Path]::GetFileNameWithoutExtension($sourcePath)
if ($packageMatch.Success) {
    $className = "$($packageMatch.Groups[1].Value).$className"
}

$outputDirectory = Join-Path ([IO.Path]::GetTempPath()) ([Guid]::NewGuid().ToString())
New-Item -ItemType Directory -Path $outputDirectory | Out-Null

try {
    & javac -d $outputDirectory @javaFiles
    if ($LASTEXITCODE -ne 0) {
        exit $LASTEXITCODE
    }

    & java -cp $outputDirectory $className
    exit $LASTEXITCODE
}
finally {
    Remove-Item -LiteralPath $outputDirectory -Recurse -Force
}
