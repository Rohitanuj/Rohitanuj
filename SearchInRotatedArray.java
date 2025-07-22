class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low +high)/2;
            if(nums[mid]==target) return mid;//normal condition 
            
            if(nums[low]<=nums[mid])  {   //form
               if(target>=nums[low]&&target<nums[mid])
                   high=mid-1;
                else 
                    low=mid+1;
            }                                // for left Half Sorted 
            
            else
            { if(target>nums[mid]&& target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }//for Right Hallf Sorted
        }
        return -1;
    }
}
