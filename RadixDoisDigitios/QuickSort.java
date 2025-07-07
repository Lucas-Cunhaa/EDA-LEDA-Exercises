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

 public int[] RadixSort(int[] nums) {
    int size = String.valueOf(v[0]).length();
    int result[] = new int[nums.length]; 

    for(int i = 0; i < size; i = i + 2 ) {
      int module = (int) Math.pow(10, i);
    }

 }

 public int getLower(int[] v, int module) {
  int menor = v[0];

  for(int i = 1; i < v.length; i++) {
   
  }
 }

 public int calcModle(int num, int module) {
   return (num / module) % 100; 
 }

}
