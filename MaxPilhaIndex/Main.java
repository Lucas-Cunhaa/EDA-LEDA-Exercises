import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int index = sc.nextInt();

    MyStack stack = buildMyStack(values, values.length);

    System.out.println(getBiggest(stack, index));
  }

  private static MyStack buildMyStack(int[] values, int size) {
    MyStack result = new MyStack(size);

    for (int value : values) result.push(value);

    return result;
  }

  public static int getBiggest(MyStack stack, int index) {
   MyStack aux = new MyStack(index + 1);

    int i = 1;
    int biggest = stack.pop();
    aux.push(biggest);

    while (i <= index) {
      int current = stack.pop();
      aux.push(current);

      if(current > biggest) biggest = current;

      i++;
    }

    while (!aux.isEmpty()) {
      stack.push(aux.pop());
    }

    return biggest;
  }
}

class MyStack {
    private int top;
    private int[] stack;
    private int size;
    
    public MyStack(int capacity) {
        this.top = -1; 
        this.stack = new int[capacity]; 
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top+1 == this.size; 
    }

    public void push(int v) {
       // if(isFull()) throw new RuntimeException("Full");

        this.size++;
        this.stack[++this.top] = v;
    }

    public int pop() {
       // if(isEmpty()) throw new RuntimeException("Empty");

        this.size--;
        return this.stack[top--];
    }

    public int peek() {
        return this.stack[this.top];
    }
}

