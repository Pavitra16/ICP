class Solution {
    public String answerString(String word, int num) {
        if(num==1) return word;
        String s="";
        int len=word.length()-num+1;
        for(int i=0;i<word.length();i++){
            int end=Math.min(i+len,word.length());
            String s1=word.substring(i,end);
            if(s1.compareTo(s)>0) s=s1;
        }
        return s;
    }
}