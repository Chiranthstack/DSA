class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            maxEnding = Math.max(x, maxEnding + x);
            minEnding = Math.min(x, minEnding + x);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
