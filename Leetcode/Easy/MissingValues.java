class MissingValues {

    //https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];

            if(arr[i]< arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        for(int in = 0; in<arr.length;in++){
            if(arr[in] != in){
                return in;
            }
        }

        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
