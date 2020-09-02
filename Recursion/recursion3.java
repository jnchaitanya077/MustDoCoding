public class recursion3{
    public static void recursive(int n) {
        if(n == 0){
            return;
        }
        recursive(n/2);
        System.out.println(n%2);
        
    }
    public static void main(String[] args) {
        recursion3.recursive(10);
    }
}