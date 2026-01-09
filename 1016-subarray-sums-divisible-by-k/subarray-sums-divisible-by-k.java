class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int prefixSum = 0;
        int result = 0;

        for (int num : nums) {
            prefixSum += num;

            int remainder = (prefixSum % k + k) % k;

            if (map.containsKey(remainder)) {
                result += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}
