import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortRecursivo {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   
   selectionSortRecursivo(nums, 0);
  }

  public static void selectionSortRecursivo(int[] v, int i) {
    if(i == v.length) return;
  
    int im = i; 

    for(int j = i+1; j < v.length; j++) {
        if(v[im] > v[j]) 
          im = j;   

      }
    
    if(im > i)
      swap(v, i, im); 
      System.out.println(Arrays.toString(v)); 

    selectionSortRecursivo(v, i+1); 

   }

  public static void swap(int[] v, int ini, int fim) {
    int temp = v[ini]; 

    v[ini] = v[fim]; 
    v[fim] = temp;
  
  }
}
