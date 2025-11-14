class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    arr.add(n/i);
                }
            }
        }
        for(int i = arr.size() - 1; i >= 0; i--){
            System.out.print(arr.get(i) + " ");
        }
    }
}
