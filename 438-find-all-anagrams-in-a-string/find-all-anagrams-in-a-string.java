class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int a[]=new int[26];
        int b[]=new int[26];
        List<Integer>lst=new ArrayList<>();
        if(p.length()>s.length()) return lst;
        int k=p.length();
        for(int i=0;i<k;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
        if(check(a,b)) lst.add(0);
        for(int i=k;i<s.length();i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(i-k)-'a']--;
            if(check(a,b)) lst.add(i-k+1);
        }
        return lst;
    }
    public boolean check(int a[], int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}