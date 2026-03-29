class Solution {
    public int findMin(int[] arr) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<end){
            int mid = st + (end - st) / 2;
            if(arr[mid] > arr[end]){
                st = mid + 1;
            }
            else{
                end = mid;     // kynki mid check ni hoga fer isliye mid - 1 nhi likha
            }
        }
        return arr[st];
    }
}
