class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> anuj=new ArrayList<String>();
        Backtraking("",anuj,n,n);
        return anuj;
    }
public void Backtraking(String ans,List an,int left,int right){
    if(right==0)
    an.add(ans);

    if(left<right)
    Backtraking(ans+')',an,left,right-1);

    if(left> 0){
    Backtraking(ans+'(',an,left-1,right);
    }
}
}
