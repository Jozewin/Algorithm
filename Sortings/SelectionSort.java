package Sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void ssSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,21,3,2,65,7,33};
        ssSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
