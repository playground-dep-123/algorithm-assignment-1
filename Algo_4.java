import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}; 
        int temp=0;
        
        for (int j = 0; j < nums.length; j++) {

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]<nums[i+1])
            {
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            
                
            
            
           
            
        }
    }
        

        System.out.println(Arrays.toString(nums));
    }
}
