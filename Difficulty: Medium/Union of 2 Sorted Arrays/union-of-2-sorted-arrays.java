class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        int m = a.length;
        int n = b.length;
        for(int i = 0; i < m; i++){
            st.add(a[i]);
        }
        for(int j = 0; j < n; j++){
            st.add(b[j]);
        }
        for(int num : st){
            arr.add(num);
        }
        Collections.sort(arr);
        return arr;
    }
}
