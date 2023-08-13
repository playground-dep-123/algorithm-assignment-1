import java.util.Scanner;

public class Algo_10 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String number="";
        char[] numArr;
        boolean validflag=true;
loop:
        do{
        System.out.print("Enter the Phone Number:");
        number=scanner.nextLine().strip();

        if(number.isBlank()){
            System.out.println("Telephone Number Can't be empty");
            continue loop;
        };
        numArr=new char[number.length()];
        numArr=number.toCharArray();

        if((number.startsWith("+94")|| (number.startsWith("0"))) && number.length()>9)
        {
        int i=0;
        if(number.startsWith("+94"))i=3;
        else i=1;
    
        for ( ; i < numArr.length; i++) {
            
            if(!Character.isDigit(numArr[i])||i>9)
            {
                System.out.println("Invalid Phone Number");
                continue loop;
            }else{
                
                 validflag=true;
            } 
            
           
        }
        System.out.println("valid Number");

        
        }else {
                System.out.println("Invalid Phone Number");
                continue loop;
            }
        validflag=false;}while(validflag);

        
        
    }
}
