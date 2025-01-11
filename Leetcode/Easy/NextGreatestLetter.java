//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1504915388/

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {

        int head = 0;
        int tail = letters.length - 1;


        while (head <= tail) {
            int mid = head + (tail - head) / 2;

            if (letters[mid] > target) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return letters[head % letters.length];
    }

}
