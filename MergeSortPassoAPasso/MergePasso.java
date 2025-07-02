import java.util.Scanner;
import java.util.Arrays;

public class MergePasso {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   mergeSort(nums, 0, nums.length-1);

   System.out.println(Arrays.toString(nums));

  }

  public static void mergeSort(int[] v, int ini, int fim) {
      if (ini >= fim) return; 
      
      System.out.println(ini + "," +  fim);
      int mid = (ini + fim) / 2; 

      mergeSort(v, ini, mid); 
      mergeSort(v, mid+1, fim);

      merge(v, ini, mid, fim); 
   }

  public static void merge(int[] v, int ini, int mid, int fim) {
    int[] helper = copy(v, ini, fim);
     
    int midHelper = mid - ini;

    int i = 0; 
    int j = midHelper + 1; 
    int k = ini; 

    while(i <= midHelper && j <= fim - ini) {
      if(helper[i] <= helper[j])
        v[k++] = helper[i++]; 
      else
        v[k++] = helper[j++];

    }

    while(i <= midHelper) {
      v[k++] = helper[i++];
    }

    System.out.println("c: " + Arrays.toString(v));
  }

  public static int [] copy(int[] target, int ini, int fim) {
    int[] result = new int[(fim - ini)+1];

    for(int i = 0; i < result.length; i++)
       result[i] = target[ini +i]; 

    return result;
  }
}
