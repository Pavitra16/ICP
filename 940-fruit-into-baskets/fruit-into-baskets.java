class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<f.length){
            hm.put(f[j],hm.getOrDefault(f[j],0)+1);
            while(hm.size()>2){
                int c=hm.get(f[i])-1;
                if(c==0) hm.remove(f[i]);
                else hm.put(f[i],c);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}