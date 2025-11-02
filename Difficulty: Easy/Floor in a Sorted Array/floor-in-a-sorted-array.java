class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int floor = -1;
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){ 
            int mid = st + (end - st) / 2;
            if(arr[mid] <= x){
                floor = mid;
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return floor;
    }
}
