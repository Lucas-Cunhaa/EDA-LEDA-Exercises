import java.util.Scanner;
import java.util.Arrays;

public class MelhorPivot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String[] line = sc.nextLine().split(" ");
    String[] targets = sc.nextLine().split(" "); 

    int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
    int[] guess = Arrays.stream(line).mapToInt(Integer::parseInt).toArray(); 
    
    int[] helper = copy(nums);

    lomutoPartition(nums, 0, nums.length-1);
    
    int mid = nums.length / 2;
    int pivot = mid; 

    for(int i = 0; i < helper.length; i++) {
          if(nums[mid] == helper[i]) {
            pivot = i; 
            break; 

          }
    }

    

  public findBestPivot(int[] v, int num1, num2, pivot) {
    int i = pivot; 
    int j = pivot;

    (while i < v.length && j >= 0) {
      if(num1 == pivot) return num1; 
      if(num2 == pivot

    }

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

  private static int[] copy(int[] target) {
    int result = new int[target.length]

    for(int i = 0; i < v.length; i++)
      result[i] = target[i]; 

    return result;

  }


}
