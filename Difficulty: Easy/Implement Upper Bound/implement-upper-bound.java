class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int up = n;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] <= target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return st;
    }
}
