class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                a.add(arr[i]);
            }
        }
        return a;
    }
}
