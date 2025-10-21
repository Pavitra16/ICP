class MinStack {
    Stack<Integer>st=new Stack<>();
    Stack<Integer>min_st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(!min_st.isEmpty()){
            if(min_st.peek()>=val) min_st.push(val);
        }
        else min_st.push(val);
    }
    
    public void pop() {
        int ele=st.pop();
        if(min_st.peek()==ele) min_st.pop();

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min_st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */