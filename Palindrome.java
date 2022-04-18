class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int j=0;
        int[] arr=new int[10];
      for(int i=0;x!=0;i++){
          
          arr[i]=x%10;
          x=x/10;
          j++;
      }
  //  for(int i=0;i<j;i++){
  //     for(int k=j;k>0;k--){
  //         if(arr[i]!=arr[j])
  //             return false;
          for (int i = 0; i < j; i++, j--) {
            if (arr[i] != arr[j-1]) return false; 
       }
        
        return true;
          
          
          
          
    }
}
