class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            }
        }
        int ans = mp.getOrDefault(x,0);
        return ans;
    }
}