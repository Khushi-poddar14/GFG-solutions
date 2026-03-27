class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int s = 0;
        int ms = arr[0];
        for(int i = 0; i < n; i++){
            s += arr[i];
            ms = Math.max(s,ms);
            if(s < 0){
                s = 0;
            }
        }
        return ms;
    }
}
