import java.util.Arrays;

public class Troca {

  public static void main(String[] args) {
    
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    

    int limit = nums.length % 2 == 0 ? nums.length : nums.length -1; 

    for (int i = 0; i < limit -1; i+=2) {
        int temp = nums[i]; 
        
        nums[i] = nums[i+1]; 
        nums[i+1] = temp;
    }

    System.out.println(Arrays.toString(nums)); 
  }

}


