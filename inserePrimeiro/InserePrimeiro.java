import java.util.Scanner;
import java.util.Arrays;

public class InserePrimeiro {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   InserePrimeiro(nums);

   System.out.println(Arrays.toString(nums));

  }

  public static void InserePrimeiro(int[] v) {
    int i = 0; 

    while(i < v.length -1 && v[i] > v[i+1]) {
        int temp = v[i]; 

        v[i] = v[i+1]; 
        v[i+1] = temp;

        i++;
      }

   }
}
