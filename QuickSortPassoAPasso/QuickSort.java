import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   quickSort(nums, 0, nums.length-1);

   System.out.println(Arrays.toString(nums));

  }

  public static void quickSort(int[] v, int ini, int fim) {
      if (ini >= fim) return; 
      
      System.out.println(ini + "," +  fim);
      int pivot = lomutoPartition(v, ini, fim); 

      quickSort(v, ini, pivot-1); 
      quickSort(v, pivot+1, fim);
   }

  public static int lomutoPartition(int[] v, int ini, int fim) {
    int pivot = v[ini]; 
    int i = ini; 
     
    for(int j = i+1; j <= fim; j++) {
      if(pivot >= v[j]) {
        i++;
        swap(v, i, j); 
      }
    }
    
    System.out.println(Arrays.toString(v));
    
    swap(v, ini, i);

    return i;
  }

  private static void swap(int[] v, int i, int j) {
		int aux = v[i];

		v[i] = v[j];
		v[j] = aux;
	}


}
