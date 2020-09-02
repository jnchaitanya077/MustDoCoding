public class recursion{
    public static void recursive(int n) {
        if(n == 0){
            return; 
        }
        System.out.println(n);
        recursive(n-1);

    }
    public static void main(String[] args) {

        recursion.recursive(21);
    }
}