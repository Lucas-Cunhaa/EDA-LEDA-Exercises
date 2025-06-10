import java.util.Arrays;
import java.io.BufferedReader; // Importa a classe BufferedReader
import java.io.IOException;    // Importa a classe IOException (para lidar com erros de I/O)
import java.io.InputStreamReader; // Importa InputStreamReader

public class Troca {

  public static void main(String[] args) {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] nums = null; 
    
    try {
         String line = reader.readLine();
         nums = line.split(" "); 

    } catch (IOException ioe) {}

    int limit = nums.length % 2 == 0 ? nums.length : nums.length -1; 

    for (int i = 0; i < limit -1; i+=2) {
        String temp = nums[i]; 
        
        nums[i] = nums[i+1]; 
        nums[i+1] = temp;
    }

    System.out.println(Arrays.toString(nums)); 
  }

}


