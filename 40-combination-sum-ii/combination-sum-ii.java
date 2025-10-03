class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>lst=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,lst,ans);
        return ans;
    }
    public void solve(int a[], int ind,int tar, List<Integer>lst, List<List<Integer>>ans){
        if(tar==0){
            ans.add(new ArrayList(lst));
            return ;
        }
        if(ind>=a.length) return;
        for(int i=ind;i<a.length;i++){
            if(i>ind && check(a,i)==false) continue;
            else {
                if(a[i]<=tar){
                    lst.add(a[i]);
                    solve(a,i+1,tar-a[i],lst,ans);
                    lst.remove(lst.size()-1);
                }
            }
        }

    }
    public boolean check(int a[], int ind){
        int ele=a[ind];
        for(int i=0;i<ind;i++){
            if(a[i]==ele) return false;
        }
        return true;
    }
}