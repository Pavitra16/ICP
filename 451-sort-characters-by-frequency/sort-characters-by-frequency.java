class Solution {
    class pair{
        char ch;
        int freq;
        public pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a, b) -> b.freq-a.freq);
        for(char ch:hm.keySet()){
            pair p=new pair(ch,hm.get(ch));
            pq.add(p);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
           pair p=pq.remove();
           char ch=p.ch;
           int f=p.freq;
           for(int i=0;i<f;i++) sb.append(ch);
            
        }
        return sb.toString();
         

    }
}