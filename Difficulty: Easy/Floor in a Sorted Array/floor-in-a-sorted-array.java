class Solution {
    public int findFloor(int[] arr, int x) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int idx = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == x) {
                idx = mid;
                st = mid + 1;  // check if more x on right
            } 
            else if (arr[mid] < x) {
                idx = mid;     // possible floor
                st = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return idx;
    }
}
