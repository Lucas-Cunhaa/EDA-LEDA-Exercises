import java.util.Scanner;
import java.util.Arrays;

public class MelhorPivot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String[] line = sc.nextLine().split(" ");
    String[] targets = sc.nextLine().split(" "); 

    int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
    int[] guess = Arrays.stream(targets).mapToInt(Integer::parseInt).toArray(); 

    System.out.println(findBestPivot(nums, guess[0], guess[1])); 
  }

  private static int findBestPivot(int[] v, int pos1, int pos2) {
    int maiorNum1 = 0; 
    int maiorNum2 = 0;
    int menorNum1 = 0;
    int menorNum2 = 0;

    for(int i = 0; i < v.length; i++) {
      if(v[i] > v[pos1]) menorNum1++;
      else if(v[i] < v[pos1]) maiorNum1++; 

      if(v[i] > v[pos2]) menorNum2++;
      else if(v[i] < v[pos2]) maiorNum2++; 
    }

    int diff1 = maiorNum1 - menorNum1;
    int diff2 = maiorNum2 - menorNum2; 

    int result = Math.abs(diff2) >= Math.abs(diff1) ? pos1 : pos2;
  
    return result;
  }

}
