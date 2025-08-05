public class Queue {
    private int head;
    private int tail;
    private String[] queue;
    private int size;
    
    public Queue(int capacity) {
        this.head = -1; 
        this.tail = -1;
        this.queue = new String[capacity]; 
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.queue.length; 
    }

    public void addFirst(String v) {
        if (isEmpty()) this.head++;

        if (isFull()) this.head = (this.head + 1) % this.queue.length;

        this.tail = (this.tail + 1) % this.queue.length;

        this.queue[this.tail] = v;
        this.size++;
    }

    public String removeFirst() {
        if(isEmpty()) throw new RuntimeException("Empty");
        
        String current = this.queue[this.head];

        if (this.head == this.tail) {
            this.head = -1;
            this.tail = -1;
        } else this.head = (this.head + 1) % this.queue.length;
        
        return current;
    }
}