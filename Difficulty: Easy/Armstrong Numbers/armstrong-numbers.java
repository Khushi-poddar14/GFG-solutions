// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int num = n;
        while(num != 0){
            int ld = num % 10;
            sum += ld * ld * ld;
            num = num / 10;
        }
        if(sum  == n) return true;
        return false;
    }
}