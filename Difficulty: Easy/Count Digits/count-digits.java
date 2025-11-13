// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count = 0;
        while(n != 0){
            int ld = n % 10;
            if(ld != 0){
                if(num % ld == 0){
                    count++;
                }
            }
            n = n / 10;
        }
        return count;
    }
}