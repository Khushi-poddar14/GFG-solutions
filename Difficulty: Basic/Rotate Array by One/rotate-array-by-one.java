// // User function Template for Java

class Solution {
    public static void reverse(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] arr) {
        // code here
        int k = 1;
        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, k, n-1);
    }
}