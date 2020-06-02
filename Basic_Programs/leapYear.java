// Find the given year is Leap year or not?

//imports
import java.util.*;

public class leapYear{
    
    //Method
    private void isLeapYear(int year){

        if(year % 400 == 0){
            System.out.println(year +" is a Leap year.");
        }else if( year % 100 == 0){
            System.out.println(year +" is not a Leap Year.");
        }else if( year % 4 == 0){
            System.out.println(year +" is a Leap Year.");
        }else{
            System.out.println(year +" is not a Leap Year.");
        }
        return;
    }
    public static void main(String[] args){

        //user Input
        int usrInput = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Year: ");

        try{
            usrInput = scan.nextInt();
        }catch(Exception e){
            System.out.println("Enter valid Input.");
            return;

        }
        
        //object Creation
        leapYear lp = new leapYear();
        lp.isLeapYear(usrInput);

    }
}