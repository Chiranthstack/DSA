class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums) set.add(x);
        int ans=1;
        while(set.contains(ans))ans++;
        return ans;
    }
}