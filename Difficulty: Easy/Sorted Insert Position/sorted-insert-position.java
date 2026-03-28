class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return st;
    }
};