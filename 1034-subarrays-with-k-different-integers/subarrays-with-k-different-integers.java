class Solution {
    public int subarraysWithKDistinct(int[] a, int k) {
        int ans=solve(a,k)-solve(a,k-1);

        return ans;
    }
    public int solve(int a[], int k){
        int i=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int j=0;
        int n=a.length;
        int ans=0;
        while(j<n){
            hm.put(a[j],hm.getOrDefault(a[j],0)+1);
            while(hm.size()>k){
                int c=hm.get(a[i])-1;
                if(c==0) hm.remove(a[i]);
                else hm.put(a[i],c);
                i++;
            }
            ans+=(j-i+1);
           
           
            j++;
           
            
        }
        return ans;
    }
}