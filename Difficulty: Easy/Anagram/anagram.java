class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 != l2) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0;i < c1.length; i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}