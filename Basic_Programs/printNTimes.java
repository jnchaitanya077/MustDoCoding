import java.util.*;

public class printNTimes{

    private void nTimes(int n, String str){

        for(int i =0 ;i<n; i++){
            System.out.println(str);
        }

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int ntimes = scan.nextInt();
        System.out.print("Enter a String: ");
        String str = scan.next();

        printNTimes prt = new printNTimes();
        prt.nTimes(ntimes,str);

    }
}