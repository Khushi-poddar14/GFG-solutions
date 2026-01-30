class Solution {

    public static void print(int i , int N){
        if(i > N) return;
        print(i+1,N);
        System.out.print(i + " ");
    }
    void printNos(int N) {
        // code here
        print(1,N);
    }
}