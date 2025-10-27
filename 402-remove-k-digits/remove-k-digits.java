class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==0) return "0";
       Stack<Character>st=new Stack<>();
       for(int i=0;i<num.length();i++){
        while(!st.isEmpty() && k>0 && num.charAt(i)<st.peek()){
            st.pop();
            k--;
        }
        st.push(num.charAt(i));
       }
       while(!st.isEmpty() && k>0){
        st.pop();
        k--;
       }
       StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
        sb.insert(0,st.pop());
       }
       while(sb.length()>0 && sb.charAt(0)=='0'){
        sb.deleteCharAt(0);
       }
       if(sb.length()==0) return "0";
       return sb.toString();
    }
}