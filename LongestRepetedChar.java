class Solution {
    public int lengthOfLongestSubstring(String s) {
      int res=0;
      int l=0;
      HashSet<Character> anuj=new HashSet<>();

      for(int r=0;r<s.length();r++){
        if(!anuj.contains(s.charAt(r))){
            anuj.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }else{
            while(anuj.contains(s.charAt(r))){
                anuj.remove(s.charAt(l));
                l++;
            }
            anuj.add(s.charAt(r));
        }
      }  
       
      return res;
    }
}
