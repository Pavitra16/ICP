class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
            ch=word2.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        if(hm1.size()!=hm2.size()) return false;
        for(char ch:hm1.keySet()){
            if(!hm2.containsKey(ch)) return false;
        }
        HashMap<Integer,Integer>st=new HashMap<>();
        HashMap<Integer,Integer>st2=new HashMap<>();
        for(int i:hm1.values()) st.put(i,st.getOrDefault(i,0)+1);
        for(int i:hm2.values()) st2.put(i,st2.getOrDefault(i,0)+1);
        if(st.size()!=st2.size()) return false;
        for(int i: st.keySet()) {
            if(!st2.containsKey(i)) return false;
            if(st.get(i)!=st2.get(i)) return false;
        }
        return true;
    }
}