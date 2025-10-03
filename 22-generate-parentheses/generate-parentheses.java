class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>lst=new ArrayList<>();
        solve(n,"",0,0,lst);
        return lst;
    }
    public void solve(int n, String ans, int open, int close,List<String>lst){
        if(open>n || close>n || close>open) return;
        if(open==n && close==n) {
            lst.add(ans);
            return;
        }
        solve(n,ans+'(',open+1,close,lst);
        solve(n,ans+')',open,close+1,lst);

    }
}