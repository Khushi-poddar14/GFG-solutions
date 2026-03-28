class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int f = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == x){
                f = mid;
                end = mid - 1;
            }
            else if(arr[mid] < x){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        st = 0;
        end = n-1;
        a.add(f);
        int l = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == x){
                l = mid;
                st = mid + 1;
            }
            else if(arr[mid] < x) st = mid + 1;
            else{
                end = mid - 1;
            }
        }
        a.add(l);
        return a;
    }
}
