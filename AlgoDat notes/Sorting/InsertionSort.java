package Sorting;

public class InsertionSort {
    public static void insertionSort (int [] unsorted) {
        for (int i =1; i<unsorted.length; i++){
            int key = unsorted[i];
            int j = i - 1;
            while(j >= 0 && unsorted[j] > key){
                unsorted[j+1] = unsorted[j];  
                j--;
            }
            unsorted[j+1] = key;
        }
    }
    public static void main(String[] args) {
        //Test Algoritma InsertionSort
        
        int arr [] = {5, 1, 4, 1 ,3};
        insertionSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}