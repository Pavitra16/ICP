class Solution {
    public int numberOfSubstrings(String s) {
        int a[]=new int[3];
        int count=0;
        Arrays.fill(a,-1);
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']=i;
            if(a[0]!=-1 && a[1]!=-1 && a[2]!=-1) {
                count=count + 1+ Math.min(a[0],Math.min(a[1],a[2]));
            }
        }
        return count;
    }
}