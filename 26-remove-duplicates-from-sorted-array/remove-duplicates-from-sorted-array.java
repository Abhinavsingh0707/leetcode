class Solution {
    public int removeDuplicates(int[] nums) {
      // 1 2 3 3 3 4 - > 1 2 3 4 8 9
      //   j
      int k = 1;
      for(int j = 1;j < nums.length; j++){  // TC -> O(n)
        if(nums[j] != nums[j-1]){
            nums[k] = nums[j];
            k = k+1;
        }
      }
      return k;
    }
}