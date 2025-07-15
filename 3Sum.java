class Solution {
    List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(i==0|| nums[i]!=nums[i-1])
            TwoSum(i+1,nums.length-1,nums,0-nums[i]);
        
    }
        return res;
}
    
    void TwoSum(int i,int j,int[] nums,int target){
        int k=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target)
                j--;
            else if(nums[i]+nums[j]<target)
                i++;
            else
            {
                List<Integer> ans=new ArrayList();
                ans.add(k);ans.add(nums[i]);ans.add(nums[j]);
                
                res.add(ans);
                while(i<j&& nums[i]==nums[j])i++;
                while(i<j&& nums[j]==nums[j-1])j--; 
                
                i++;j--;
                
            }
        }
    }
}
