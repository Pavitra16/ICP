class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int ans=0;
        while(i<g.length && j<s.length){
            int req=g[i];
            int pres=s[j];
            if(req<=pres){
                ans++;
                i++;
                j++;
            }
            else if(pres<req) j++;
            else return ans;
        }
        return ans;
    }
}