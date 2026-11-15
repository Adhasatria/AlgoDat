package Sorting;

public class QuickSort {
    public static void quickSort(int[] unsorted) {
        quickSort(unsorted, 0, unsorted.length - 1);
    }

    private static void quickSort(int[] unsorted, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(unsorted, low, high);
        quickSort(unsorted, low, pivotIndex - 1);
        quickSort(unsorted, pivotIndex + 1, high);
    }

    private static int partition(int[] unsorted, int low, int high) {
        int pivot = unsorted[high];
        int smallerIndex = low - 1;

        for (int i = low; i < high; i++) {
            if (unsorted[i] <= pivot) {
                smallerIndex++;
                swap(unsorted, smallerIndex, i);
            }
        }

        int pivotIndex = smallerIndex + 1;
        swap(unsorted, pivotIndex, high);
        return pivotIndex;
    }

    private static void swap(int[] unsorted, int first, int second) {
        int temporary = unsorted[first];
        unsorted[first] = unsorted[second];
        unsorted[second] = temporary;
    }
}
