class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;

            while (num != 0) {
                num = num & (num - 1); 
                count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}
