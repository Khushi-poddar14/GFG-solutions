class Solution {
    public static int largest(int[] arr) {
        // code here
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
        
    }
}
