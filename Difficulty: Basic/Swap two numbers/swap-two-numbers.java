class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> arr = new ArrayList<>();
        int temp = a;
        a = b;
        b = temp;
        arr.add(a);
        arr.add(b);
        return arr;
    }
}