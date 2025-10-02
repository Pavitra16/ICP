class Solution {
    public int findMinArrowShots(int[][] a) {
       // if(a.length==1) return 1;
        Arrays.sort(a,(c,b)->c[1]-b[1]);
        int count=1;
        int st=a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=st && a[i][1]>=st) continue;
            else {
                count++;
                st=a[i][1];
            }
        }
        return count;
    }
}