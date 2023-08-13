
import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       
        char[] word;
        String wordTemp="";
        boolean validFlag=false;
        String convertingString=" ";

        
      
        // do{
        //     System.out.print("Enter a ASCII Value:");
        //     wordTemp=scanner.nextLine().strip();
        //     if(wordTemp.isBlank())
        //     {
        //         System.out.println("Try Valid Number");
        //         validFlag=true;
        //     }
        //     else{
        //         validFlag=false;
        //     }
            
         
        // }while(validFlag);

        wordTemp="56";

        word=wordTemp.toCharArray();
        
        char[]tempArray=new char[word.length];
        for (int j = 0,k=word.length-1; j < word.length; j++,k--) {


            tempArray[j]=word[k];
        }
        word=tempArray;

       char num;
       String[] num2=new String[word.length];
       
       for (int i = 0; i < word.length; i++) {
       
           num2[i]=word[i]+" ";
          
        
       }


       for (int i = 0; i < num2.length; i++) {

        convertingString.concat(num2[i]).strip();
        
       }

       


      System.out.println(Arrays.toString(num2));

       

     

 

       
        
    
        

    }
}
