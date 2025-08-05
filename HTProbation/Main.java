import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int index = sc.nextInt();

    System.out.println(solution());
  }

  public static void solution() {

  }
}

class HashTableOpen {
  private final Pair SENTINEL = new Pair(-1, "sentinel");
  private Pair[] table;
  
 public HashTableOpen () {
    this.tabela = new Pair[53];
 }

 public void put(Pair p) {
    int probation = 0;
    int keyHash = hash(p.getKey());
    int pos = (keyHash + probation) % this.table.length;
    int freeSpace = pos;
    
    while (probation < this.table.length) {
      if(this.table[pos] == null || this.table[pos].equals(p)) {
        freeSpace = pos;
        break;
      }

      if(this.table[pos].equals(this.SENTINEL) && pos == freeSpace == 0) freeSpace = pos;
      
      probation++;
      pos = (keyHash + probation) % this.table.length;
    }

    this.table[freeSpace] = p;
 }

 public void remove(int key) {
  int hashKey = hash(key);
  int probation = 0;
  int pos = (probation + hashKey) % this.table.length;

  while(probation < this.table.length) {
    if(this.table[pos] == null) return;

    if(this.table[pos].getKey() == key) this.table[pos] = this.SENTINEL;

    probation++;
    pos = (probation + hashKey) % this.table.length;
  }
 }

 private int hash(int key) {
  return key % this.table.length;
 }
}

class Pair {
  private int key; 
  private String value;

  public Pair(int key, String value) {
    this.key = key;
    this.value = value;
  }

  public int getKey() {
      return key;
  }

  public String getValue() {
      return value;
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true; 
    if (o == null || getClass() != o.getClass()) return false;  

    Pair pair = (Pair) 0;
    return this.key == pair.key;
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }
}