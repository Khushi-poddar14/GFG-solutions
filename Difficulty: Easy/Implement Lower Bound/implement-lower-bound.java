class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int lb = n;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] >= target){
                lb = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return lb;
    }
}
