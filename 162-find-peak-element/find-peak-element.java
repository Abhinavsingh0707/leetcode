class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1)return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2])return n-1;
        
        // if there is no peak on position first and last then it should be on mid
        int low = 1 , high = n-2;
        while(low <= high){
            // if peak is mid element
            int mid = low + (high - low) / 2;
            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            
            // if we are in left side
            if(nums[mid] > nums[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
        

    }
}