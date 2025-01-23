class FindInMountainArray{

  // https://leetcode.com/problems/find-in-mountain-array/
  public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);

        if( firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length() - 1);

    }

    public static int peakIndexInMountainArray(MountainArray arr) {
        int head = 0;
        int tail = arr.length() - 1;


        while (head < tail) {
            int mid = head + (tail - head)/2;
            if (arr.get(mid) > arr.get(mid+1)) {
                tail = mid;
            } else {
                head = mid + 1;
            }
        }
        return head;
    }

    static int orderAgnosticBS(MountainArray arr, int target, int start, int end){
        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr.get(mid) == target){
                return mid;
            }

            if(isAsc){
                if(target < arr.get(mid)){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr.get(mid)){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


interface MountainArray {
      public int get(int index);
      public int length();
}
