class Solution {

    public static void print(int i , int N){
        if(i > N){
            return;
        }
        System.out.print("GFG" + " ");
        print(i+1, N);
    }
    void printGfg(int N) {
        // code here
        print(1,N);
    }
}