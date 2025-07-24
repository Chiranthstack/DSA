class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        // Loop through each pair of elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If the pair sums to the target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // If no pair is found (shouldn't happen as per problem constraints)
        return new int[0];
    }
} 


