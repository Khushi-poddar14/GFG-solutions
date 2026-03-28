// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int idx = -1;
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] >= x){
                idx = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return idx;
    }
}
