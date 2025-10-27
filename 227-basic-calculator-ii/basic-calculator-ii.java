class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
        int num=0;
        char sn='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9') num=num*10 + (ch-'0');
            if((!Character.isDigit(ch) && ch!=' ') || i==s.length()-1){
                if(sn=='-') st.push(-num);
                else if(sn=='+') st.push(num);
                else if(sn=='*') st.push(st.pop()*num);
                else st.push(st.pop()/num);

                num=0;
                sn=ch;
            }
        }
        num=0;
        while(!st.isEmpty()){
            num=num + st.pop();
        }
        return num;
    }
}