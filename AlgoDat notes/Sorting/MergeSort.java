package Sorting;

public class MergeSort {
    public static void mergeSort(int[] unsorted) {
        int[] temporary = new int[unsorted.length];
        sortRange(0, unsorted.length - 1, unsorted, temporary);
    }

    private static void sortRange(int left, int right, int[] unsorted, int[] temporary) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        sortRange(left, middle, unsorted, temporary);
        sortRange(middle + 1, right, unsorted, temporary);
        merge(left, middle, right, unsorted, temporary);
    }

    private static void merge(int left, int middle, int right, int[] unsorted, int[] temporary) {
        int leftIndex = left;
        int rightIndex = middle + 1;
        int mergedIndex = left;

        while (leftIndex <= middle && rightIndex <= right) {
            if (unsorted[leftIndex] <= unsorted[rightIndex]) {
                temporary[mergedIndex] = unsorted[leftIndex];
                leftIndex++;
            } else {
                temporary[mergedIndex] = unsorted[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex <= middle) {
            temporary[mergedIndex] = unsorted[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex <= right) {
            temporary[mergedIndex] = unsorted[rightIndex];
            rightIndex++;
            mergedIndex++;
        }

        for (int index = left; index <= right; index++) {
            unsorted[index] = temporary[index];
        }
    }
}
