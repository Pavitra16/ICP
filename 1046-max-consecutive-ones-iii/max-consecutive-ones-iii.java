class Solution {
    public int longestOnes(int[] a, int k) {
        int i=0;
        int j=0;
        int ans=0;
        int c=0;
        while(j<a.length){
            if(a[j]==0) c++;
            while(c>k){
                if(a[i]==0) c--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}