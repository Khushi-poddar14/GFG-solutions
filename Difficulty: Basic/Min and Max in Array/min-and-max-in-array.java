class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> nums = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
            else if(arr[i] > max) max = arr[i];
        }
        nums.add(min);
        nums.add(max);
        return nums;
    }
}
