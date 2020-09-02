//Sum of first n Natural numbers.
public class One{

    public int nSum(int n){
        int temp = 0;
        for(int i =1;i<n+1;i++){
            temp = temp +i;
        }
        return temp;

    }

    public static void main(String[] args){

        One sum = new One();
        System.out.println(sum.nSum(2));

    }
}