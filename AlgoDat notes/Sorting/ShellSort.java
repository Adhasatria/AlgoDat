package Sorting;

public class ShellSort {
    public static void shellSort(int[] unsorted) {
        for (int gap = unsorted.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < unsorted.length; i++) {
                int value = unsorted[i];
                int j = i;

                while (j >= gap && unsorted[j - gap] > value) {
                    unsorted[j] = unsorted[j - gap];
                    j -= gap;
                }

                unsorted[j] = value;
            }
        }
    }
}
