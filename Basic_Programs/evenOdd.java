//imports
import java.util.*;  

public class evenOdd{

    //method
    public String isEven(int num){
        if(num%2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args){
        //Taking Input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int usrInput = scan.nextInt();
        
        //Creating object
        evenOdd result = new evenOdd();
        String a = result.isEven(usrInput);
        System.out.println(usrInput+": "+a);
    }
}