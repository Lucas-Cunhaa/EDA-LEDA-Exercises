import java.util.Scanner;
import java.util.Arrays;

public class MoveDown {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   String[] line = sc.nextLine().split(" ");
   String[] quant = sc.nextLine().split(" ");

   int[] nums = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
   int[] value = Arrays.stream(quant).mapToInt(Integer::parseInt).toArray();
   
   String result = "";

   for(int i = 0; i < value[0]; i++) {
    getMenor(nums, i);

    result += String.valueOf(getMenor(nums, i));

    result += " ";
   }

   System.out.println(result.trim());
  }

  public static int getMenor(int[] v, int fim) {
    int menor = 0;

    for(int i = 0; i < v.length - fim; i++) {
      if(v[i] < v[menor]) menor = i; 
    }

    int valorMenor = v[menor];

    swap(v, menor, v.length-1-fim);
     
    return valorMenor;
  }
  private static void swap(int[] v, int i, int j) {
		int aux = v[i];

		v[i] = v[j];
		v[j] = aux;
	}


}
