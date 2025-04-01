class Solution {
    public List<Integer> majorityElement(int[] nums) {
       

 // Return type is List<Integer>
        int cand1 = 0, cand2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
            else if (count1 == 0) { cand1 = num; count1 = 1; }
            else if (count2 == 0) { cand2 = num; count2 = 1; }
            else { count1--; count2--; }
        }

        // Verify if candidates appear more than n/3 times
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(cand1);
        if (count2 > nums.length / 3) result.add(cand2);

        return result; // Now matches return type (List<Integer>)
    }
}

   
    