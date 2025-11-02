class Solution {
    int floorSqrt(int n) {
        // code here
        int st = 0;
        int end = n;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(mid * mid <= n){
                ans = mid;
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}