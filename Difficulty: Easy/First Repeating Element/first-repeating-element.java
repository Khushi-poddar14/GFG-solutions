class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int n = arr.length;
        int idx = -1;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    return i+1;
                }
            }
        }
        return idx;
    }
}
