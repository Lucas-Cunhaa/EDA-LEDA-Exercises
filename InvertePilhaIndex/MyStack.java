public class MyStack {
    private int top;
    private String[] stack;
    private int size;
    
    public MyStack(int capacity) {
        this.top = -1; 
        this.stack = new String[capacity]; 
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top+1 == this.size; 
    }

    public void push(String v) {
       // if(isFull()) throw new RuntimeException("Full");

        this.size++;
        this.stack[++this.top] = v;
    }

    public String pop() {
       // if(isEmpty()) throw new RuntimeException("Empty");

        this.size--;
        return this.stack[top--];
    }

    public String peek() {
        return this.stack[this.top];
    }
}