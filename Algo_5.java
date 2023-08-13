
import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
        String wordTemp="";
        boolean validFlag=false;
        char[] charArray;
        char[] reversedArray;
      

        do{
            System.out.print("Enter a ASCII Value:");
            wordTemp=scanner.nextLine().strip();
            if(wordTemp.isBlank())
            {
                System.out.println("Try Valid Number");
                validFlag=true;
            }
            else{
                validFlag=false;
            }
            
         
        }while(validFlag);

       
        charArray=wordTemp.toCharArray();
        reversedArray=new char[wordTemp.length()];
       

        for (int i = 0,k=charArray.length-1; i < charArray.length; i++,k--) {
            reversedArray[i]=charArray[k];
        }

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.printf("%s ",reversedArray[i]);
            
        }
        System.out.println();
        



    

       

     

 

       
        
    
        

    }
}
