class Solution {
    public static int[] rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       reverse(nums,0,n-1);// for whole array to be reversed
       reverse(nums,0,k-1);// for array start to k-1 element
       reverse(nums,k,n-1);// for k  to length of array - 1
       return nums;
    }
    public static void reverse(int[] nums,int start,int end){
        while(start <= end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}