class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == key) return mid;
            
            //means if first half is sorted
            else if(arr[st] <= arr[mid]){
                if(arr[st] <= key && arr[mid] > key){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
            else{
                if(arr[end] >= key && arr[mid] < key){
                    st = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}