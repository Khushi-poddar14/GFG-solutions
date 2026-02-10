// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int n = arr.length;
        int[] num = {-1,-1};
        for(int i = n-1; i > 0; i--){
            if(arr[i-1] == arr[i]){
                num[0] = i;
                num[1] = arr[i];
                break;
            }
        }
        return num;
    }
}
