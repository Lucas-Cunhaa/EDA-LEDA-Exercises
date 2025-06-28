import java.util.Scanner;
import java.util.Arrays;

public class MarianaLivros {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(", ");
   
   organizaLivros(line);

}
  public static void organizaLivros(String[] v) {
    for(int i = 1; i < v.length; i++) {
      int j = i;

      System.out.println(Arrays.toString(v));

      while(j > 0 && v[j].compareTo(v[j-1]) < 0) {
          String temp = v[j]; 

          v[j] = v[j-1]; 
          v[j-1] = temp;

          j--;
       }
    }
  }
}
