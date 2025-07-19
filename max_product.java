class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans =max;

        for(int i =1 ; i < nums.length;i++){
            int curr = nums[i];
            int temp = Math.max(curr , Math.max(min*curr , max*curr));
            min = Math.min(curr , Math.min(min*curr , max*curr) );
            max = temp;

            ans = Math.max(max, ans);
        }
        return ans;
    }
}
