class MyStack {

Queue<Integer>q=new LinkedList<>();
Queue<Integer>q1=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size()==0){
            q.add(x);
            while(q1.size()!=0){
                q.add(q1.poll());
            }
        }
        else if(q.size()!=0 && q1.size()==0){
            q1.add(x);
            while(q.size()!=0){
                q1.add(q.poll());
            }
        }
    }
    
    public int pop() {
        if(q.size()!=0){
            return q.poll();
        }
       return q1.poll();
    }
    
    public int top() {
        if(q.size()!=0){
            return q.peek();
        }
        return q1.peek();
    }
    
    public boolean empty() {
        if(q.size()==0 && q1.size()==0){
            return true;
    }
    return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */