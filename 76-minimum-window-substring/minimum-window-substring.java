class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        int st=-1;
        int ed=-1;
        int len=Integer.MAX_VALUE;
        int a[]=new int[123];
        while(j<s.length()){
            a[s.charAt(j)]++;
            while(check(a,hm)){
                int start=i;
                int end=j;
                if(end-start+1<len){
                    st=start;
                    ed=end;
                    len=ed-st+1;
                }
                a[s.charAt(i)]--;
                i++;
            }
            j++;
        }
        String ans="";
        if(st==-1 && ed==-1) return ans;
        for(int k=st;k<=ed;k++) ans=ans+s.charAt(k);

        return ans;
    }
    public boolean check(int a[], HashMap<Character,Integer>hm){
        for(char ch:hm.keySet()){
            int count=a[ch];
            if(hm.get(ch)>count) return false;
        }
        return true;
    }
}