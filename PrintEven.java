import java.util.Scanner;
 
public class PrintEven {
    public static void main(String[] args){
        
        int limit, i;
        
        //create a scanner object to get the input
        Scanner in = new Scanner(System.in);
        
        //get the limit from user
        System.out.print("Enter the limit:");
        limit = in.nextInt();
        
        //print the even numbers
        System.out.println("Even numbers:");
        
        //loop till the limit
        for(i=1; i<=limit; i++){
            
            //divide by 2 if remainder is 0 then it is an even number
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}