import java.util.Arrays;
import java.io.BufferedReader; // Importa a classe BufferedReader
import java.io.IOException;    // Importa a classe IOException (para lidar com erros de I/O)
import java.io.InputStreamReader; // Importa InputStreamReader

public class Palindromo {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String line = ""; 
    
    try {
         line = reader.readLine(); 

    } catch (IOException ioe) {}
    
      String cleanS = line.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
    
      int i = 0;
      int j = cleanS.length() -1;

      while(i < j) {
        if(cleanS.charAt(i) != cleanS.charAt(j)) return false;

        i++;
        j--;
      }

    return true;

    //System.out.println(newLine); 
  }

}


