class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        int n = arr.length;
        int ans = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i] , 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(val % k != 0) ans = key;
        }
        return ans;
    }
}