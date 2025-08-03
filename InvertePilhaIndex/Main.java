import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    sc.nextLine();
    String[] values = sc.nextLine().split(" ");
    int index = sc.nextInt();

    MyStack stack = buildMyStack(values, size);

    invertMyStack(stack, index);

    System.out.println("_");
    System.out.println();

    while (!stack.isEmpty())
      System.out.println(stack.pop());
  }

  private static MyStack buildMyStack(String[] values, int size) {
    MyStack result = new MyStack(size);

    for (String value : values) result.push(value);

    return result;
  }

  public static void invertMyStack(MyStack stack, int index) {
    Queue aux = new Queue(index + 1);

    int i = 0;
    while (i <= index) {
      aux.addFirst(stack.pop());
      i++;
    }

    i = 0;
    while (i <= index) {
       stack.push(aux.removeFirst());
      i++;
    }
  }
}

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