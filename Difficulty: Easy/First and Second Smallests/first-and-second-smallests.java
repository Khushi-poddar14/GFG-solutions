import java.util.*;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        int n = arr.length;

        if (n < 2) {
            nums.add(-1);
            return nums;
        }

        int min1 = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }

        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > min1 && arr[i] < min2) {
                min2 = arr[i];
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            nums.add(-1);   // all elements same case
        } else {
            nums.add(min1);
            nums.add(min2);
        }

        return nums;
    }
}
