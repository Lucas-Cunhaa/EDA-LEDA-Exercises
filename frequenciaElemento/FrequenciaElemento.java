import java.util.Scanner;

public class FrequenciaElemento {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
 
   String target = sc.nextLine(); 

   String[] line = sc.nextLine().split(" "); 
   
   System.out.println(frequenciaElemento(target, line));

  }

  public static int frequenciaElemento(String target, String[] v) {
    int freq = 0; 

    for(int i = 0; i < v.length; i++) 
      if(v[i].equals(target)) 
        freq++;
    
    return freq; 
  }
}
