class Solution {
    static int sod(int n){
        if(n>=0 && n <= 9) return n;
        return n%10 + sod(n/10);
    }
    static int sumOfDigits(int n) {
        // code here
        return sod(n);
    }
}
