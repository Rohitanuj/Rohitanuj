class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i=0,j=numbers.length-1;
     //   int[] ans=new int[2];
        while(i<j){
            if((numbers[i]+numbers[j]==target)){
            break;  
            }
            else if((numbers[i]+numbers[j]<target)){
                i++;
                }
            else 
                j--;
            }
                
            
        
      //  for(int k=0;k<2;k++)
    //   return System.out.print(ans[i]);
       return new int[]{i + 1, j + 1};
    }
}
