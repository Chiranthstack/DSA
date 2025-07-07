class Solution {
    public int missingNumber(int[] nums) {
        //we use XOR approach as XOR is commutative and each xor will get mapped
         int allXOR = 0;

    // XOR all numbers in range [0, n]
    for (int i = 0; i <= nums.length; i++) {
      allXOR = allXOR ^ i;
    }

    // XOR all numbers in the given array
    for (int num : nums) {
      allXOR = allXOR ^ num;
    }

    // The missing number
    return allXOR;
        
    }
}