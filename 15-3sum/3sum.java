class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums.length <3 || nums==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int p1 = i+1;
            int p2 = nums.length-1;
            
            while(p1<p2){
                int sum = nums[i]+nums[p1]+nums[p2];
                if(sum==0){
                   
                    result.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    while(p1<p2 && nums[p1]==nums[p1+1]){
                        p1++;
                    }
                    while(p1<p2 && nums[p2] == nums[p2-1]){
                        p2--;
                    }
                    p1++;
                    p2--;

                }
                else if(sum<0){
                    p1++;
                }
                else if(sum>0){
                    p2--;
                }
                while(i+1<nums.length && nums[i] == nums[i+1]){
                    i++;
                }
                
            }
        }
        return result;
    }
}