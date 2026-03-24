class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition=nums.length-1;
        for(int index=nums.length-2;index>=0;index--){
            if(index+nums[index]>=finalPosition){
                finalPosition=index;
            }
        }
        return finalPosition==0;  
    }
}