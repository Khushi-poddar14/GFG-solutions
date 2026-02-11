class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        if(n < 3) return false;
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum == target) return true;
                else if(sum > target) r--;
                else{
                    l++;
                }
            }
        }
        return false;
    }
}
