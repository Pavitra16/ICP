class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String s1="";
            for(int i=0;i<s.length()-1;i++){
                int n1=s.charAt(i)-'0';
                int n2=s.charAt(i+1)-'0';
                int n3=(n1+n2)%10;
                s1=s1+n3;
            }
            s=s1;
        }
        if(s.charAt(0)==s.charAt(1)) return true;
        return false;
    }
}