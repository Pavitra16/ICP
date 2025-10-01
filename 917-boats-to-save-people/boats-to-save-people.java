class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int l=limit;
        int i=0;
        int j=p.length-1;
        int ans=0;
        while(i<=j){
            if(i==j && p[i]<=l){
                ans++;
                i++;
                j--;
            } 
            else{
            int p1=p[i];
            int p2=p[j];
            if(p1+p2<=l){
                ans++;
                i++;
                j--;
            }
            else if(p2<=l){
                ans++;
                j--;
            }
            else if(p1<=l){
                ans++;
                i++;
            }
            }
        }
        return ans;
    }
}