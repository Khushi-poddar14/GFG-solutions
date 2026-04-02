class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st < end){
            int mid = st + (end - st) / 2;
            if(arr[mid] < arr[mid+1]){
                st = mid + 1;
            }
            else
                end = mid;
        }
        return st;
    }
}