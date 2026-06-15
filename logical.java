import java.util.* ;
public class logical{
    public static void main (String args[]){
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b = sc.nextInt();
        System.out.println("the result of logical AND operator is :" + (a > 0&& b > 0));
        System.out.println("the result of logical or operator is ." + (a > 0 || b > 0));
        System.out.println("the result of logical NOT operator is . " + !(a > 0));
        sc.close();
    }

}
