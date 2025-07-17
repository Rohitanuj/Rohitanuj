class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
        int[] pre=new int[n];
        int[] post=new int[n];
        pre[0]=1;
        post[n-1]=1;
        for(int i=1;i<n;i++){
           pre[i]=nums[i-1]*pre[i-1]; 
        }
        for(int i=n-2;i>=0;i--){
            post[i]=nums[i+1]*post[i+1];
        }
    //    int[] product=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=pre[i]*post[i];
        }
        return nums;
    }
}
