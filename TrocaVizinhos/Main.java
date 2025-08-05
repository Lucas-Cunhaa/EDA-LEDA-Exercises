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

  public trocaVizinhos(LinkedList ll, int index) {
        Node current = ll.getNode(index);

        Node prevNext = current.next;
        Node prevPrev = current.prev;

        if(index != 0) current.prev.next = current.next;
        if(current != ll.tail) current.next.next.prev = current;

        current.next = current.next.next;
        current.prev = prevNext;

        prevNext.prev = prevPrev;
        prevNext.next = current;
        
  }
}


public class LinkedList {
    Node head; 
    Node tail; 
    int size;
    
    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public Node getNode(int index) {
        Node current = this.head;
        i = 0;
        while(i <= index && current != null) {
            current = current.next;
            i++;
        }

        return current;
    }
}
public class Node {
    public Node next; 
    public Node prev;
    public int value; 

    public Node(int value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}

