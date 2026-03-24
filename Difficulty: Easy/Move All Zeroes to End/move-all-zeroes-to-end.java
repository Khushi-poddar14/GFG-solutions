class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int idx = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[idx] = arr[i];
                idx++;
            }
        }
        for(int i = idx; i < n; i++){
            arr[i] = 0;
        }
    }
}