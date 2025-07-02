import java.util.Scanner;
import java.util.Arrays;

public class Lomuto {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   lomutoPartition(nums, 0, nums.length-1);

   System.out.println(Arrays.toString(nums));

  }
  public static int lomutoPartition(int[] v, int ini, int fim) {
    int pivot = v[fim]; 
    int i = fim;
    
    for(int j = i-1; j >= ini; j--) {

        if(pivot <= v[j]) {
          i--; 
          swap(v, i, j);
       System.out.println(Arrays.toString(v)); 
        }
    }
     
   
    swap(v, fim, i);
    System.out.println(Arrays.toString(v));    
    return i;
  }

  private static void swap(int[] v, int i, int j) {
		int aux = v[i];

		v[i] = v[j];
		v[j] = aux;
	}


}
