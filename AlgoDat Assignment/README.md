# AlgoDat Assignment

Repository ini berisi implementasi struktur data dan tugas Algoritma & Struktur Data (AlgoDat) menggunakan bahasa pemrograman Java.

---

## 📁 Struktur Direktori

```text
AlgoDat Assignment/
├── LindkedList/
│   ├── Band.java
│   ├── Car.java
│   ├── Linkedlist.java
│   ├── Main.java
│   └── Node.java
├── Queue/
│   ├── Main.java
│   └── Queue.java
├── Stack/
│   ├── InfixToPostfix.java
│   ├── Main.java
│   └── Stack.java
└── README.md
```

> [!IMPORTANT]
> **Penting:** Semua file Java di dalam proyek ini menggunakan deklarasi `package` (`LindkedList`, `Queue`, dan `Stack`).
> Oleh karena itu, semua proses kompilasi (`javac`) dan eksekusi (`java`) **harus dijalankan dari folder utama proyek (`AlgoDat Assignment`)**, bukan dari dalam subfolder.

---

## 🛠️ Prasyarat

Pastikan Java Development Kit (JDK) sudah terpasang di komputer Anda. Anda dapat mengeceknya melalui terminal / command prompt:

```bash
java -version
javac -version
```

---

## 🚀 Panduan Menjalankan Program

Buka terminal (PowerShell / Command Prompt / Git Bash) dan arahkan ke direktori root `AlgoDat Assignment`.

### 1. Linked List
Struktur data Single Linked List dengan implementasi kelas `Car` dan `Band`.

- **Kompilasi:**
  ```powershell
  javac LindkedList\Main.java
  ```
- **Jalankan:**
  ```powershell
  java LindkedList.Main
  ```

---

### 2. Queue
Implementasi struktur data antrean (Queue) berbasis linked list dengan operasi `enqueue`, `dequeue`, `peek`, dan `display`.

- **Kompilasi:**
  ```powershell
  javac Queue\Main.java
  ```
- **Jalankan:**
  ```powershell
  java Queue.Main
  ```

---

### 3. Stack (Infix to Postfix)
Implementasi struktur data tumpukan (Stack) berbasis linked list serta konverter notasi matematika dari Infix ke Postfix.

- **Kompilasi:**
  ```powershell
  javac Stack\Main.java
  ```
- **Jalankan:**
  ```powershell
  java Stack.Main
  ```
- *Program akan meminta input ekspresi matematika infix (contoh: `A + B * C` atau `(2 + 3) * 4`).*

---

## 💡 Tips Tambahan

### Mengompilasi Semua Modul Sekaligus:
```powershell
javac LindkedList\*.java Queue\*.java Stack\*.java
```

### Menghapus File Hasil Kompilasi (`.class`):
Jika ingin membersihkan file `.class`:
- **Windows (PowerShell):**
  ```powershell
  Get-ChildItem -Recurse -Filter "*.class" | Remove-Item
  ```
- **Linux / macOS / Git Bash:**
  ```bash
  find . -name "*.class" -type f -delete
  ```
