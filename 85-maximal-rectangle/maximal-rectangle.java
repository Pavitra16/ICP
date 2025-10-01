class Solution {
    public int maximalRectangle(char[][] m) {
        int a[]=new int[m[0].length];
        int ans=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]=='1') a[j]++;
                else a[j]=0;
            }
            ans=Math.max(ans,maxArea(a));
        }
        return ans;
    }
        public int maxArea(int[] a) {
        Stack<Integer>st=new Stack<>();
        int ans=0;
        int n=a.length;

        for(int i=0;i<=n;i++){
            int val=(i==n)?0:a[i];
        while(!st.isEmpty() && val<a[st.peek()]){
            int tbs=st.pop(); //to be solved
            int nsr=i; //next smaller at right
            int nsl=(st.size()==0)?-1:st.peek(); //next smaller at left;
            int width=nsr-nsl-1;
            ans=Math.max(ans,width*a[tbs]);
        }
       
        st.push(i);
        }
        return ans;
    }
}