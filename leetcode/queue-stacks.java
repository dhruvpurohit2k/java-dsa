class MyQueue {

    int[] stack ;
    int capacity = 50;
    int size = 0;
    public MyQueue() {
        stack = new int[capacity];
    }
    
    public void push(int x) {
        stack[size++] = x;
    }
    
    public int pop() {
        int popped = stack[0];
        for(int i = 0;i<size-1;i++){
            stack[i] = stack[i+1];
        }
        size--;
        return popped;
    }
    
    public int peek() {
        return stack[0];
    }
    
    public boolean empty() {
        if(size==0) return true;
        else return false;
    }
}
