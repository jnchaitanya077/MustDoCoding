public class recursion2{
    public static void recursive(int n) {
        if(n == 0){
            return; 
        }
        recursive(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        recursion2.recursive(10);
    }
}