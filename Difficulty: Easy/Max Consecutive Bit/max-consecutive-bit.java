class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int cnt0 = 0;
        int cnt1 = 0;
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt1++;
                cnt0 = 0;
                max = Math.max(cnt1,max);
            }
            else{
                cnt0++;
                cnt1 = 0;
                max = Math.max(max,cnt0);
            }
        }
        return max;
    }
}
