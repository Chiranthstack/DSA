class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq=new int[k];
        freq[0]=1;
        int prefixSum=0;
        int count=0;
        for(int num:nums){
            prefixSum+=num;
            int remainder=prefixSum%k;
            if(remainder<0)remainder+=k;
            count+=freq[remainder];
            freq[remainder]++;
        }
        return count;

        
    }
}