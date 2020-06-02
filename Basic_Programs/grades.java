/*Print the grade based on the percentages given, following is the grading criteria.
>= 95 - Ex
>=90 and < 95 - A+
>=85 and < 90 - A
>=80 and < 85 - B+
>=75 and < 80 - B
>=70 and < 75 - C
<70 - F*/

//imports
import java.util.*; 

public class grades{
    //class method
    private String calGrade(int percent){
        if(percent < 70){
            return "F";
        }else if(percent >= 95){
            return "Ex";
        }else if(percent >= 90 && percent <= 95){
            return "A+";
        }else if(percent >= 85 && percent <= 90){
            return "A";
        }else if(percent >= 80 && percent <= 85){
            return "B+";
        }else if(percent >= 75 && percent <= 80){
            return "B";
        }else{
            return "C";
        }

    }

    public static void main(String[] args){

        //UserInput
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Percentage: ");
        int usrInput = 0;

        //throw exception if number is not given
        try{
            usrInput = scan.nextInt();
        }catch( Exception e){
            System.out.println("Enter vaild Input.");
            return;
        }
        
        //Enter only if value is between 0-100
        if(usrInput >=0 && usrInput <=100){

            //Object creation
            grades cal = new grades();
            System.out.println("Your Grade: "+cal.calGrade(usrInput));
            return;
        }
        System.out.println("Enter vaild Percentage between 0-100.");
        
    }
}