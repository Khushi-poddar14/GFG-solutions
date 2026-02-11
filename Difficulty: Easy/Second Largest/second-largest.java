class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max1 = -1;
        int max2 = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > max1) max1 = arr[i];
        }
        for(int j = 0; j < n; j++){
            if(arr[j] > max2 && arr[j] != max1) max2 = arr[j];
        }
        return max2;
    }
}