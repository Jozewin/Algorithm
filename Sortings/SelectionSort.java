package Sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void ssSort(int[] arr){
        /**
         * ==Ascending Order==
         * Time complexity = O(n^2)
         */
        /**
         * Setting the outer loop which is used to compare
         */
        for (int i = 0;i<arr.length-1;i++){
            /**
             * Setting minIndex to compare inner loop
             */
            int minIndex = i;
            /**
             * Setting the Inner loop which will be used to compare with outer loop
             */
            for(int j = i+1;j<arr.length;j++){
                /**
                 * Condition operations when found j is smaller than i
                 */
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            /**
             * Swapping i and j
             */
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
