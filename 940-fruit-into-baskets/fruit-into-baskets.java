class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=0;
        int len=0;
        int n=fruits.length;
        for(int j=0;j<n;j++){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(hm.size()>2){
                int c=hm.get(fruits[i])-1;
                if(c==0) hm.remove(fruits[i]);
                else hm.put(fruits[i],c);
                i++;
            }
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}