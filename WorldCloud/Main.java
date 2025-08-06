import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
  private HashMap<String, Integer> freq;

  public Main() {
    this.freq = new HashMap<String, Integer>();
  }

  public void registerFreq(String text) {
    String[] values = text.split(" ");

    for (String v : values) {
      this.freq.put(v, freq.getOrDefault(v, 0) + 1);
    }
  }

  public int getFreq(String text) {
    return this.freq.get(text) != null ? freq.get(text) : 0;
  }

  public static void main(String[] args) {
    Main sol = new Main();

    HashMap<String, Integer> freq = new HashMap<String, Integer>();
    Scanner sc = new Scanner(System.in);

    String text = sc.nextLine();

    sol.registerFreq(text);

    text = sc.nextLine();
    while (!text.equals("fim")) {
      System.out.println(sol.getFreq(text));

      text = sc.nextLine();
    }
  }
}