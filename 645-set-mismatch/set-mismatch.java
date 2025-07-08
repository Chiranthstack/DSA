class Solution {
    public int[] findErrorNums(int[] nums) {
   Set<Integer> seen = new HashSet<>();
   int dup=-1;
   int actualSum=0;
   int n=nums.length;

   for(int num:nums){
    if(seen.contains(num)){
        dup=num;
    }
    seen.add(num);
    actualSum+=num;
   }
   int expectedSum=n*(n+1)/2;
   int missing = expectedSum - (actualSum - dup);
   return new int[]{dup,missing};

    }
}