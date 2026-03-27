class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i< n; i++){
            sum = target - arr[i];
            if(mp.containsKey(sum)){
                return true;
            }
            mp.put(arr[i],i);
        }
        return false;
    }
}