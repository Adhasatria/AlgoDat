package Sorting;

public class SelectionSort {

    public static void selectionSort(int [] unsorted){
        for (int i=0; i< unsorted.length-1;i++){
            int minIndex = i;
                for (int j=i+1; j< unsorted.length;j++){
                    if(unsorted[j]< unsorted[minIndex]){
                        minIndex= j;
                    }
                    
                }
                int temp;
                    temp = unsorted[minIndex];
                    unsorted[minIndex] = unsorted[i];
                    unsorted[i] = temp; 
        }
    }

    public static void main(String[] args) {
        // int arr[]= {5,3,1,5,6,7,8,2};
        // selectionSort(arr);
        // for(int i=0; i< arr.length; i++){
        //      System.out.print(arr[i]+ " ");
        // }
    }
}
