class Solution {
    public void sortColors(int[] nums) {
        int minIndex = 0;

        //8 2 4 3 6
        //i
        //  j
        for(int i = 0 ; i< nums.length; i = i+1){
            minIndex = i;
            for(int j = i+1; j < nums.length; j = j+1){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}