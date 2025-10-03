class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>lst=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(nums,0,lst,ans);
        return ans;
    }
    public void solve(int a[], int ind, List<Integer>lst, List<List<Integer>>ans){
        if(ind==a.length) {
            ans.add(new ArrayList<>(lst));
            return ;
        }
        lst.add(a[ind]);
        solve(a,ind+1,lst,ans);
        lst.remove(lst.size()-1);
        solve(a,ind+1,lst,ans);

    }
}