import java.util.Scanner;
import java.util.Arrays;

public class InsereUltimo {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   insereUltimo(nums);

   System.out.println(Arrays.toString(nums));

  }

  public static void insereUltimo(int[] v) {
    int i = v.length -1; 

    while(i > 0 && v[i] < v[i-1]) {
        int temp = v[i]; 

        v[i] = v[i-1]; 
        v[i-1] = temp;

        i--;
      }

   }
}
