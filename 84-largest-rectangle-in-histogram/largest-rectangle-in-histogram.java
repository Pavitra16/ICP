class Solution {
    public int largestRectangleArea(int[] a) {
        Stack<Integer>st=new Stack<>();
        int ans=0;
        int n=a.length;

        for(int i=0;i<=n;i++){
            int val=(i==n)?0:a[i];
        while(!st.isEmpty() && val<a[st.peek()]){
            int tbs=st.pop();
            int nsr=i;
            int nsl=(st.size()==0)?-1:st.peek();
            int width=nsr-nsl-1;
            ans=Math.max(ans,width*a[tbs]);
        }
       
        st.push(i);
        }
        return ans;
    }
    
}