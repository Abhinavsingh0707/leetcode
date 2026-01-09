class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1); // base case

        int prefixsum = 0;
        int result = 0;

        for (int num : nums) {
            prefixsum += num;

            if (sumCountMap.containsKey(prefixsum - k)) {
                result += sumCountMap.get(prefixsum - k);
            }

            sumCountMap.put(prefixsum,
                sumCountMap.getOrDefault(prefixsum, 0) + 1);
        }

        return result;
    }
}
