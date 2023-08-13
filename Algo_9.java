import java.util.Arrays;
import java.util.Scanner;

public class Algo_9 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String[] arr;
        char [] charArr;
        boolean validFlag=false;
        String word="";
        do{

        System.out.print("Enter a Word: ");
        
        word=scanner.nextLine();
        // arr=new String[word.length()];
        arr=word.split(" ");
        if(word.isBlank()|| arr.length>1)
        {
            System.out.println("Not Valid Enter Again");
            validFlag=true;
        }else validFlag=false;}while(validFlag);

        charArr=word.toCharArray();
        validFlag=true;
        
        for (int i = 0,k=charArr.length-1; i < charArr.length; i++,k--) {
            
            if(!(charArr[i]==charArr[k])) 
            {
                System.out.println("Not a Palindrome");
                validFlag=false;
                break;

            }

            
        }
        if(validFlag)System.out.println("The word is palindrome");

       
    
        
    }
}
