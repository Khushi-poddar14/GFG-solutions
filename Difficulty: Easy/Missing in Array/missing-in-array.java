class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        long sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += arr[i];
        }
        long ts = (long)n * (n+1)/2;
        return (int)(ts - sum);
    }
}