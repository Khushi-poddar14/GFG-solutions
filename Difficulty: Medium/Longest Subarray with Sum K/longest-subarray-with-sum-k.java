// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int ml = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                ml = Math.max(ml, i+1);
            }
            if(mp.containsKey(sum - k)){
                int len = i - mp.get(sum-k);
                ml = Math.max(len,ml);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return ml;
    }
}
