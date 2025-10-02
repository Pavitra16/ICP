class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        int a[]=new int[26];
        while(j<s.length()){
            a[s.charAt(j)-'A']++;
            count=Math.max(count,a[s.charAt(j)-'A']);
            while(j-i+1-count>k){
                a[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}