package Sorting;

public class SelectionSort {
    public static void selection(int[] arr){
        int n = arr.length;

        for(int i = 0; i< n-1; i++){
            int minIndex = i;
            for(int j = i+1; j< n-1; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {5, 1, 2, 4, 3};
        selection(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
