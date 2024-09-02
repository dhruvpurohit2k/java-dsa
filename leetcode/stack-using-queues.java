
class MyStack {

    private int[] array;
    int MAX_CAPACITY = 50;
    int size;

    public MyStack() {
        this.array = new int[this.MAX_CAPACITY];
        this.size = 0;
    }
    
    public void push(int x) {
        this.array[size++] = x;
    }
    
    public int pop() {
        size--;
        return this.array[size];
    }
    
    public int top() {
        return this.array[size-1];
    }
    public boolean empty() {
        if(size==0) return true;
        else return false;
    }
}
