import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0)
            return new int[0][0];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Add first interval
        result.add(intervals[0]);

        // Step 3: Merge intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);
            int[] current = intervals[i];

            // Overlapping intervals
            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } 
            // Non-overlapping interval
            else {
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
