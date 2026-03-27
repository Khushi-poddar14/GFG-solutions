// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            
            if(mp.containsKey(sum-k)){
                int len = (i - mp.get(sum-k));
                maxLen = Math.max(len, maxLen);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
}
