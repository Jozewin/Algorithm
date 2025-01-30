class Solution {
     public static void main(String[] args){
        int arr[] = { 4, 6, 7, 1, 2, 3};
       System.out.println(rotationCount(arr));
       
     }

    static int rotationCount(int[] arr){

      int pivot = findPivot(arr);
      return pivot+1;
    }
     int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }

            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


}
