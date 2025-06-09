class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
  // Base case: return empty array if input is invalid
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length; // Length of the input array
        int[] result = new int[n - k + 1]; // Result array to store maximums for each window
        Deque<Integer> deque = new ArrayDeque<>(); // Deque to store indices of useful elements

        for (int i = 0; i < n; i++) {
            // Remove indices from the front of the deque if they are out of the current window
            // (i - k + 1) is the start index of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices from the back of the deque if the corresponding value is less than nums[i]
            // because they can’t be the maximum if nums[i] is larger
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(i);

            // If the first window is complete (i >= k - 1), add the max to the result
            // The max of the current window is at the front of the deque
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;      
        
    }
}