class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while( low <= high){
            int mid = low + (high - low)/2;
            // if mid is equal to target
            if(nums[mid] == target){
                return true;
            }
            // if the low and high elements are same as mid element
            if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }
            // left part is sorted side the target is then
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    // element exits
                    high = mid - 1;
                }else{
                    // element does not exits
                    low = mid + 1;
                }
            }else{
                // if right part is sorted:
                if(nums[mid] <= target && target <= nums[high]){
                    // element exists
                    low = mid + 1;
                }
                else {
                    // element not exists
                    high = mid - 1;
                }
            }
        }
        return false;
        
        
    }
}