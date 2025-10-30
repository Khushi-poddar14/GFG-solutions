class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(x < arr[mid]){
                end = mid - 1;
            }
            else{
                idx = mid;
                st = mid + 1;
            }
        }
        return idx;
    }
}
