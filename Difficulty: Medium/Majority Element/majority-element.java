class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int m = n/2;
        int ans = -1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i] , 0) + 1);
        }
        for(int k : mp.keySet()){
            int val = mp.get(k);
            if(val > m){
                ans = k;
            }
        }
        return ans;
    }
}