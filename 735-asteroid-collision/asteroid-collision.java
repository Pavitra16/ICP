class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        solve(st,asteroids);
        int a[]=new int[st.size()];
        int i=a.length-1;
        while(!st.isEmpty()) a[i--]=st.pop();
        return a;
    }
    public void solve(Stack<Integer>st, int[]a){
        for(int i:a){
            if(i>0) st.push(i);
            else{
                while(!st.isEmpty() && st.peek()<-i && st.peek()>0){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0) st.push(i);
                else if(st.peek()==-i) st.pop();
            }
        }
    }
}