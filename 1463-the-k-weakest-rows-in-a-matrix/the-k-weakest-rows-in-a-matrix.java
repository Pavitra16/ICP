class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1) cnt++;
            }
            int arr[]={i,cnt};
            pq.add(arr);

        }
        int ans[]=new int[k];
        int i=0;
        while(!pq.isEmpty() && i<k){
            int b[]=pq.remove();
            ans[i]=b[0];
            i++;
        }
        return ans;

    }
}