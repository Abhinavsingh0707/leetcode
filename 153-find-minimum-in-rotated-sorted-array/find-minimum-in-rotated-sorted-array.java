class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            //left half is sorted
            if(nums[low] <= nums[mid]){
                // keep the minimum
                ans = Math.min(ans ,nums[low]);
                low = mid + 1;
            }else {
                // if right part is sorted:
                ans = Math.min(ans , nums[mid]);
                high = mid - 1;

            }
        }
        return ans;
        
    }
}