class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        // T: O(m.logm + nlogn)
        // S: O(min(n,n) + logm + logn)

        int [] res = new int[nums1.length];
        int k = 0;

        int i = 0,
            j = 0;
        // nums1 = [1,1,2,2]
        //                  i
        // nums2 = [2,2]
        //              j
        // res = [2,2]
        //            k

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                res[k] = nums1[i];
                k = k+1;
                i =i+1;
                j =j+1;
            }else if(nums1[i] > nums2[j]){
                j = j+1;
            }else{
                i = i+1;
            }
        }
       
        return Arrays.copyOfRange(res, 0, k); // [2,2]
    }
}