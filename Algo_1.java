import java.util.Scanner;

public class Algo_1{
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int num;

      do{
            

      
        System.out.print("Enter a Number: ");
        num=scanner.nextInt();
        

        if(num>=0)
        {
            int i=0;
            int previousSum=0;
            
            int sum=1;
            int fiboNum=0;

            
            
        fibonachiLoop:
           do{   
            if(i==0||i==1)
            {
                   
        
                System.out.printf("%d,",i);   
                continue fibonachiLoop;
               
            }
           

           fiboNum=sum+previousSum;
           previousSum=sum;
           sum=fiboNum;
           System.out.printf("%s,",fiboNum);
            

           }while(i++<num);
           System.out.print("\b"+" ");

        }else System.out.println("Enter a Valid Number!!!");
    }while(num<0);
        
    }

}