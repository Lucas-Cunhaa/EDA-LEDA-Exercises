import java.util.Scanner;
import java.util.Arrays;

public class MoveN {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   InserePrimeiro(nums);

   System.out.println(Arrays.toString(nums));

  }

  public static void moveN(int[] v) {

  }
}