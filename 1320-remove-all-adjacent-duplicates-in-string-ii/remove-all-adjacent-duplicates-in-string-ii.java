class Solution {
    class pair{
        char ch;
        int cnt;
        public pair(char ch, int cnt){
            this.ch=ch;
            this.cnt=cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        return solve(s,k);
    }
    public String solve(String s, int k){
        Stack<pair>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            if(!st.isEmpty() && st.peek().ch==ch){
                count=st.peek().cnt;
            }
            count++;
            if(count==k){
                for(int j=1;j<k;j++) st.pop();
                continue;
            }
            pair p=new pair(ch,count);
            st.push(p);

        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.insert(0,st.pop().ch);
        return sb.toString();
    }
}