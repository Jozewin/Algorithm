public class FindMissingPositive {
    public int firstMissingPositive(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;

            if(arr[i] > 0 && arr[i]<= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        for(int in = 0; in<arr.length;in++){
            if(arr[in] != in+1){
                return in+1;
            }
        }

        return arr.length+1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
