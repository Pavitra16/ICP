class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>lst=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(n,1,k,lst,ans);
        return ans;
    }
    public void solve(int n, int ind, int k,List<Integer>lst,List<List<Integer>>ans){
        if(lst.size()==k){
            ans.add(new ArrayList(lst));
            return;
        }
        if(ind>n || lst.size()>k) return;
        for(int i=ind;i<=n;i++){
            lst.add(i);
            solve(n,i+1,k,lst,ans);
            lst.remove(lst.size()-1);
        }
    }
}