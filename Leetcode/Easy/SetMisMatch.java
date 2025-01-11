public class SetMisMatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        for(int in = 0; in<arr.length;in++){
            if(arr[in] != in+1){
                return new int[]{arr[in], in+1};
            }
        }

        return new int[]{-1, -1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
