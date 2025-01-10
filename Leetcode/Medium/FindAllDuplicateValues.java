class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ansList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ansList.add(nums[index]);
            }
        }

        return ansList;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
