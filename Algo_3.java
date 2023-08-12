public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}; 
        int[]nums2=new int[nums.length];

        for (int i = 0,k=nums.length-1; i < nums.length; i++,k--) {

            nums2[i]=nums[k];
            
        }
        nums=nums2;
        for (int i = 0; i < nums.length; i++) {
            
            System.out.printf("%s,",nums[i]);
        }
        System.out.print("\b"+" \n");
        
    }
}
