class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while(left<=right){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq){
                arr[pos--]=leftSq;
                left++;
            } else {
                arr[pos--]=rightSq;
                right--;
            }
        } 
        return arr;      
    }
}