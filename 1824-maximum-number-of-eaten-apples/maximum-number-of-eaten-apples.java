class Solution {
    class pair{
        int apple;
        int day;
        public pair(int apple, int day){
            this.apple=apple;
            this.day=day;
        }


    }
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.day-b.day);
        int day=1;
        int count=0;
        int i=0;
        while(i<apples.length || !pq.isEmpty()){
            
           if(i<apples.length && apples[i]>0 ) pq.add(new pair(apples[i],i+days[i]));
            while(!pq.isEmpty() && pq.peek().day<day) pq.remove();
            if(pq.size()>0){
                pair p=pq.remove();
                p.apple--;
                count++;
              
                if(p.apple>0 && p.day>=day) pq.add(p);
            }
            day++;
            i++;
            

        }
       
        return count;
    }
}