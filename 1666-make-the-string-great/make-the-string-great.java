class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            while(i<s.length() && !st.isEmpty() && ((st.peek()==s.charAt(i)-32) || (st.peek()-32==s.charAt(i)))) {
                st.pop();
                i++;
            }
           if(i<s.length()) st.push(s.charAt(i));
            i++;

        }
        StringBuilder s1=new StringBuilder();
        while(!st.isEmpty()){
            s1.insert(0,st.pop());
        }
        return s1.toString();
    }
}