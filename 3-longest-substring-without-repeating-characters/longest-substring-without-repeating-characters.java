class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int i=0;
        int j=0;
        Set<Character>st=new HashSet<>();
        while(j<s.length()){
            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(s.charAt(j));
            len=Math.max(j-i+1,len);
            j++;
        }
        return len;
    }
}