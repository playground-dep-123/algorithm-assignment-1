import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

     
        boolean validFlag=false;
        
        String sentence=" ";

         do{
            System.out.print("Enter a Senetence:");
            sentence=scanner.nextLine().strip();
            if(sentence.isBlank())
            {
                System.out.println("There are no any word Try Again");
                validFlag=true;
            }
            else{
                validFlag=false;
            }
            
         
        }while(validFlag);


       int max=0;
       String longestWord=" ";
       String shoretestWord=" ";
       int min=50;
        
        String[] arr=new String[sentence.length()];
        arr=sentence.split(" ");

         for (int i = 0; i < arr.length; i++) {
               if(arr[i].length()>max)
               {
                max=arr[i].length();
                longestWord=arr[i];
               }

               if(arr[i].length()<min && arr[i].length()>1)
               {
                min=arr[i].length();
                shoretestWord=arr[i];
               }
         }


         System.out.printf("Longest Word: %s, Lenght: %s\n",longestWord,max);
         System.out.printf("Shortest Word: %s, Lenght: %s\n",shoretestWord,min);

       
      

        
    }
}
