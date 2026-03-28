class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int f = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == target){
                f = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target){
                st = mid + 1;
            }
            else end = mid - 1;
        }
        st = 0;
        end = n - 1;
        int l = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == target){
                l = mid;
                st = mid + 1;
            }
            else if(arr[mid] < target){
                st = mid + 1;
            }
            else end = mid - 1;
        }
        if(f == -1 && l == -1) return 0;
        int num = l - f + 1;
        return num;
    }
    
    
}
