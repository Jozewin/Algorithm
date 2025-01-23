class FindPeakElement{
//https://leetcode.com/problems/find-peak-element/
    public int findPeakElement(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;


        while (head < tail) {
                int mid = head + (tail - head)/2;
                if (arr[mid] > arr[mid + 1]) {
                    tail = mid;
                } else {
                    head = mid + 1;
                }
            }
        return head;
    }
}
