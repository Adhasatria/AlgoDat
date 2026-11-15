package Sorting;

public class BubbleSort {
    public static void bubbleSort (int [] unsorted) {
        for (int i = 0; i < unsorted.length-1; i++ ){
            for (int j = 0; j < unsorted.length-1-i; j++ ){
                if(unsorted[j] > unsorted[j+1]){
                    int temp;
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j + 1] = temp;

                }

            }
        } 

    }
    
    public static void main(String[] args) {
        //Test Algoritma BubbleSort
        
        // int arr [] = {5, 1, 4, 1 ,3};
        // bubbleSort(arr);
        // for(int i=0; i< arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }
    }
}
