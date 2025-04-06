class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurance = new int[26]; // A-Z ke liye frequency array
        int left = 0, right = 0;
        int ans = 0;
        int maxOccurance = 0;

        while (right < s.length()) {
            // Right character ko count karo
            occurance[s.charAt(right) - 'A']++;
            // Maximum freq update karo (window ke andar sabse zyada aane wala character)
            maxOccurance = Math.max(maxOccurance, occurance[s.charAt(right) - 'A']);

            // Check karo kya replacement allowed hai
            if ((right - left + 1) - maxOccurance > k) {
                // Too many replacements needed, window chhota karo
                occurance[s.charAt(left) - 'A']--;
                left++;
            }

            // Max window length update karo
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}
