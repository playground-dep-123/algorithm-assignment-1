import java.util.Arrays;
import java.util.Scanner;

public class Algo_6 {
   
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
        String wordTemp="";
        boolean validFlag=false;
        String[] strArray;
        String[] reversedArray;
      

        do{
            System.out.print("Enter a Sentence: ");
            wordTemp=scanner.nextLine().strip();
            if(wordTemp.isBlank())
            {
                System.out.println("Try Valid Sentence");
                validFlag=true;
            }
            else{
                validFlag=false;
            }
            
         
        }while(validFlag);

       
        strArray=wordTemp.split(" ");
        reversedArray=new String[strArray.length];

       

        for (int i = 0,k=strArray.length-1; i < strArray.length; i++,k--) {

            reversedArray[i]=strArray[k];
            
        }

    
        
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.printf("%s ",reversedArray[i]);
            
        }
        System.out.println();
        
    }
}
