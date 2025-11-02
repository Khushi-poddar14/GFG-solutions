class Solution {
    int single(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        // check first element
        if (arr[0] != arr[1]) return arr[0];
        // check last element
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1; // should not reach here
    }
}
