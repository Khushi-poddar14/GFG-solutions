class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == k){
                idx = mid;
                end = mid - 1;
            }
            else if(k > arr[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return idx;
    }
}