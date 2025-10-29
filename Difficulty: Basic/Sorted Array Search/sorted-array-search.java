class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == k) return true;
            else if(k > arr[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}