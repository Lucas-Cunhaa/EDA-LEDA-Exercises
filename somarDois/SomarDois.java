import java.util.Arrays;
import java.io.BufferedReader; // Importa a classe BufferedReader
import java.io.IOException;    // Importa a classe IOException (para lidar com erros de I/O)
import java.io.InputStreamReader; // Importa InputStreamReader
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet; 

public class SomarDois {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String line = ""; 
    
    try {
         line = reader.readLine(); 

    } catch (IOException ioe) {}
    
  }
  
  public static void SomarDois(String[] v, int target) {
     Map<Interger, Interger> nums = new HashSet<Interger>(); 

     for(int i = 0; i < v.length; i++) {
        nums.add(Interger.parseInt(v[i]));   
     }

     for(int i = 0; i < v.length; i++) {
        int rest = target - Interger.parseInt(v[i]); 

        if(nums.contains(rest))
          return new Int[]{Interger.parseInt(v[i]), rest}; 
     }
      

     return new Int[]{}; 
  }
}


