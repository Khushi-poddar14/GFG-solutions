class Solution {
    static int count(int n){
        if(n==0) return 0;
        return 1 + count(n/10);
    }
    public int countDigits(int n) {
        // code here
        return count(n);
    }
}
