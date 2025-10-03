class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]!=b[0]?b[0]-a[0] : a[1]-b[1]);
        List<int[]>lst=new ArrayList<>();
        for(int [] p: people){
            lst.add(p[1],p);
        }
        int a[][]=new int[people.length][people[0].length];
        for(int i=0;i<lst.size();i++){
            a[i]=lst.get(i);
        }
        return a;
    }
}