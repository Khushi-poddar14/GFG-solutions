// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count = 0;
        while(num!=0){
            int ld = num % 10;
            if(ld != 0 && n % ld == 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}