class Solution {
    public static int sum(int n){
        int x = n;
        int s = 0;
        while(n!=0){
            x = n%10;
            s+=x;
            n = n/10;
        }
        return s;
    }
    static int sumOfDigits(int n) {
        // code here
        return sum(n);
    }
}
