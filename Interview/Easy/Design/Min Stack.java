class MinStack {
Stack <Integer>s;
    /** initialize your data structure here. */
    public MinStack() {
        s=new Stack();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        int t=s.pop();
        s.push(t);
        return t;
    }
    
    public int getMin() {
        Iterator itr=s.iterator();
        int min=Integer.MAX_VALUE;
        while(itr.hasNext())
        {
            int i= (Integer)itr.next();
            if(i<min)min=i;
        }
        return min;
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
