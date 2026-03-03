class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int cursum = 0, totsum = 0, curMsum = 0;
        for (int i = 0; i < nums.length; i++) {

            // Maximum subarray sum (Kadane’s)
            cursum = Math.max(nums[i], cursum + nums[i]);
            maxsum = Math.max(cursum, maxsum);

            // Minimum subarray sum
            curMsum = Math.min(nums[i], curMsum + nums[i]);
            minsum = Math.min(curMsum, minsum);
            totsum = totsum + nums[i];
        }

        // Edge case: if all elements are negative
        if (maxsum < 0) {
            return maxsum;
        }
        return Math.max(maxsum, totsum - minsum);
    }
}