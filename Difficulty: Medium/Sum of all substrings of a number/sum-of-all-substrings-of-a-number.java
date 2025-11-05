class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String num = s.substring(i , j+1);
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}