class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> lst = new ArrayList<Integer>();
        int m=a.length;
        int n=a[0].length;
        int total=m*n;
        int minr=0;
        int minc=0;
        int maxr=m-1;
        int maxc=n-1;
        int count=0;
        while(count<total)
        {
            for(int i=minc;i<=maxc && count<total;i++)
            {
                lst.add(a[minr][i]);
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count<total;i++)
            {
                lst.add(a[i][maxc]);
                count++;
            }
            maxc--;
            for(int i=maxc;i>=minc && count<total;i--)
            {
                lst.add(a[maxr][i]);
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<total;i--)
            {
                lst.add(a[i][minc]);
                count++;
            }
            minc++;
        }
        return lst;
    }
}
