import java.util.Scanner;
import java.util.Arrays;

public class EstatisticaOrdem {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   System.out.println(getEstatistica(nums));

   lomutoPartition(nums, 0, nums.length-1);
  }

  public static int getEstatistica(int[] v) {
    int estatistica = 1;

    for(int i = 0; i < v.length; i++) {
      if(v[i] < v[0]) estatistica++;

    }

    return estatistica;
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

    swap(v, ini, i);

    return i;
  }

  private static void swap(int[] v, int i, int j) {
		int aux = v[i];

		v[i] = v[j];
		v[j] = aux;
	}

}
