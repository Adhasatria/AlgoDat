# Sorting Algorithms

This folder contains Java implementations of common sorting algorithms. Each method sorts an `int[]` in ascending order and changes the supplied array directly (in place).

## Algorithms

| Algorithm | Main idea | Best time | Average time | Worst time | Extra space | Stable |
|---|---|---:|---:|---:|---:|---|
| Bubble Sort | Repeatedly compare adjacent values and swap them when out of order. | O(n²) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | Find the smallest value in the unsorted portion and move it to the front. | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | Insert each next value into its position in the sorted portion. | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | Recursively split the array, then merge the sorted portions. | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Shell Sort | Apply insertion-style passes over decreasing gaps. | Depends on gap sequence | Depends on gap sequence | O(n²) | O(1) | No |
| Quick Sort | Partition around a pivot, then recursively sort both sides. | O(n log n) | O(n log n) | O(n²) | O(log n) average; O(n) worst-case stack | No |

`n` is the number of array elements. Bubble Sort's best case is O(n²) because this implementation does not stop early when a pass makes no swaps. Shell Sort's gap sequence affects its performance; this implementation repeatedly halves the gap, and its worst case is O(n²). Quick Sort chooses the last element in each range as its pivot, which can produce its O(n²) worst case on certain inputs.

## Files and methods

| File | Method |
|---|---|
| `BubbleSort.java` | `BubbleSort.bubbleSort(int[] unsorted)` |
| `SelectionSort.java` | `SelectionSort.selectionSort(int[] unsorted)` |
| `InsertionSort.java` | `InsertionSort.insertionSort(int[] unsorted)` |
| `MergeSort.java` | `MergeSort.mergeSort(int[] unsorted)` |
| `ShellSort.java` | `ShellSort.shellSort(int[] unsorted)` |
| `QuickSort.java` | `QuickSort.quickSort(int[] unsorted)` |

## Usage

The classes are in the `Sorting` package. For example, from a class in another package:

```java
import Sorting.QuickSort;

public class SortingExample {
    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 3};

        QuickSort.quickSort(values);

        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
```

This demo uses only a primitive array and a loop to display the result; it does not use Java Collections or array utility libraries. Replace `QuickSort.quickSort` with another method from the table to try a different algorithm. The array is modified directly, so the method does not return a new array.

## Choosing an algorithm

- Use **Insertion Sort** for small or nearly sorted arrays.
- Use **Merge Sort** when predictable O(n log n) performance and stability are important; it uses additional memory.
- Use **Quick Sort** to study partitioning and divide-and-conquer; its pivot choice can affect performance.
- Use **Bubble Sort**, **Selection Sort**, and **Shell Sort** to compare simpler in-place sorting strategies and their trade-offs.
