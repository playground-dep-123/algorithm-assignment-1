public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        int[]temp;

        System.out.print("numA \u2229 numB = ");

    for (int i = 0,k=0; i < numA.length; i++) {
        
        for (int j = 0; j < numB.length; j++) {

            if(numA[i]==numB[j]) System.out.printf("%s ",numA[i]);
            
        }
        
    }
    System.out.println();
    System.out.print("numA \u222A numB = ");
    temp=new int[numA.length+numB.length];
    for (int i = 0,k=0; i < numA.length; i++,k++) {

        
        temp[i]=numA[k];
        temp[numB.length+k]=numB[k];
       
    
        
    }

    for (int i = 0; i < temp.length; i++) {
        System.out.printf("%s ",temp[i]);
    }

    System.out.println();

// numA\numB
System.out.print("numA \\ numB = ");
temp=new int[numB.length];

 for (int i = 0,k=0; i < numA.length; i++) {
        
        for (int j = 0; j < numB.length; j++) {

            if(numA[i]==numB[j]) temp[i]=numB[i];
            else temp[i]=numB[i]; 
        }
        
    }
loop:
    for (int i = 0; i < numA.length; i++) {
        int count=0;
        for (int j = 0; j < temp.length; j++) {
            if(!(numA[i]==temp[j]))
            {
                count+=1;
                if(count==temp.length)
                {
                    System.out.printf("%s ",numA[i]);
                }
            }
            else continue loop;
           
            
        }
        
    }
    System.out.println();

    //numB\numA
System.out.print("numB \\ numA = ");
temp=new int[numA.length];

 for (int i = 0,k=0; i < numA.length; i++) {
        
        for (int j = 0; j < numA.length; j++) {

            if(numB[i]==numA[j]) temp[i]=numA[i];
            else temp[i]=numA[i]; 
        }
        
    }
loop:
    for (int i = 0; i < numB.length; i++) {
        int count=0;
        for (int j = 0; j < temp.length; j++) {
            if(!(numB[i]==temp[j]))
            {
                count+=1;
                if(count==temp.length)
                {
                    System.out.printf("%s ",numB[i]);
                }
            }
            else continue loop;
           
            
        }
        
    }
    System.out.println();

    // A △ B
    System.out.print("numB \u0394 numA = ");     


    temp=new int[numB.length];

 for (int i = 0,k=0; i < numA.length; i++) {
        
        for (int j = 0; j < numB.length; j++) {

            if(numA[i]==numB[j]) temp[i]=numB[i];
            else temp[i]=numB[i]; 
        }
        
    }
loop:
    for (int i = 0; i < numA.length; i++) {
        int count=0;
        for (int j = 0; j < temp.length; j++) {
            if(!(numA[i]==temp[j]))
            {
                count+=1;
                if(count==temp.length)
                {
                    System.out.printf("%s ",numA[i]);
                }
            }
            else continue loop;
           
            
        }
        
    }

    temp=new int[numA.length];

 for (int i = 0,k=0; i < numA.length; i++) {
        
        for (int j = 0; j < numA.length; j++) {

            if(numB[i]==numA[j]) temp[i]=numA[i];
            else temp[i]=numA[i]; 
        }
        
    }
loop:
    for (int i = 0; i < numB.length; i++) {
        int count=0;
        for (int j = 0; j < temp.length; j++) {
            if(!(numB[i]==temp[j]))
            {
                count+=1;
                if(count==temp.length)
                {
                    System.out.printf("%s ",numB[i]);
                }
            }
            else continue loop;
           
            
        }
        
    }
           
    
   
    
    

    }
}
