class Solution {
    // Function to calculate factorial of a number.
    public static int fact(int n){
        if(n==1) return 1;
        return (n* fact(n-1));
    }
    int factorial(int n) {
        // code here
        return fact(n);
    }
}
