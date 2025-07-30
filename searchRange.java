class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] ans=new int[2];
        ans[0]=bSearchMin(nums,target);
        ans[1]=bSearchMax(nums,target);
        return ans;
        }
    public int bSearchMin(int[] nums, int target){
            int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            
            if(nums[mid]>target)
                high =mid-1;
            else if(nums[mid]<target)
                low =mid+1;
            
            else 
            {
                if(mid==0|| nums[mid-1]!=nums[mid])
                      return mid;
                else 
                    high =mid-1;      
            }    
        }
        return -1;
    }
    
    
      public int bSearchMax(int[] nums,int target){
           int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            
            if(nums[mid]>target)
                high =mid-1;
            else if(nums[mid]<target)
                low =mid+1;
            
            else 
            {
                if(mid==nums.length-1|| nums[mid+1]!=nums[mid])
                      return mid;
                else 
                    low =mid+1;      
            }    
        }
        return -1;
    }
    
    }
