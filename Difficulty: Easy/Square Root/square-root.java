class Solution {
    int floorSqrt(int n) {
        // code here
        int root = 1;
        for(int i = 0; i <= n; i++){
            if(i * i > n) break;
            root = i;
        }
        return root;
    }
}