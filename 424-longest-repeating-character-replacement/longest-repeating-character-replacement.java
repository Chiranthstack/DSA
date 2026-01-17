class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxFreq=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            int index=s.charAt(right)-'A';
            freq[index]++;
            maxFreq=Math.max(maxFreq, freq[index]);
            int windowSize=right-left+1;
            if(windowSize-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen ,right-left+1);

        }
        return maxLen;
        
    }
}