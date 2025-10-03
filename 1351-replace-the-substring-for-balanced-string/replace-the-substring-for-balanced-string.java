class Solution {
    public int balancedString(String s) {
        int []a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'A']++;
        }
        int i=0;
        int j=0;
        int n=s.length();
        int res=n;
        int k=n/4;
        int count=0;
        while(j<s.length()){
            a[s.charAt(j)-'A']--;
            while(i<n && a['Q'-'A']<=k && a['W'-'A']<=k && a['E'-'A']<=k && a['R'-'A']<=k){
                res=Math.min(res,j-i+1);
                a[s.charAt(i)-'A']++;
                i++;
            }
            j++;
        }
        return res;
    }
}   