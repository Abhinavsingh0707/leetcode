class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0; // No jumps needed if there's only one element

        int jumps = 0, farthest = 0, currentEnd = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                if (currentEnd >= nums.length - 1) break; // If we can reach the end
            }
        }
        
        return jumps;
    }
}
