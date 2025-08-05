import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] values = sc.nextLine().split("");

    System.out.println(isValid(values));
  }

  private static MyStack buildMyStack(String[] values, int size) {
    MyStack result = new MyStack(size);

    for (String value : values) result.push(value);

    return result;
  }

  public static String isValid(String[] values) {
    MyStack aux = new MyStack(values.length);

    for(String value : values) {
      if(value.equals("(")) aux.push(value);
      else {
        if (aux.isEmpty()) {
          return "N";
        }

        aux.pop();
      }
    }
  
    return aux.isEmpty() ? "S" : "N";
  }
}

class MyStack {
    private int top;
    private String[] stack;
    private final int capacity;

    public MyStack(int capacity) {
        this.top = -1; 
        this.stack = new String[capacity]; 
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top + 1 == this.capacity; 
    }

    public void push(String v) {
        if(isFull()) return;

        this.stack[++this.top] = v;
    }

    public String pop() {
        if(isEmpty()) return null;

        return this.stack[this.top--];
    }

    public String peek() {
        return this.stack[this.top];
    }

    public int getSize() {
        return this.top + 1;
   
  }
}