// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> nums = new ArrayList<>();
        int first = -1;
        int last = -1;
        int st = 0;
        int n = arr.length;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == x){
                first = mid;
                end = mid - 1;
            }
            else if(x > arr[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        st = 0;
        end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == x){
                last = mid;
                st = mid+1;
            }
            else if(x > arr[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        nums.add(first);
        nums.add(last);
        return nums;
    }
}
