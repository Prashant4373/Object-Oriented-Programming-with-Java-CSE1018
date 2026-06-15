import java .util.*;
public class arithmetic {
    public static void main (String arge []){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number  :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.println("the sum of numbers is :" + (a+b));
        System.out.println("the differance between two numbers is :"+(a-b));
        System.out.println("the product of two numbers is :"+ (a*b));
        System.out.println("the quotient of two numbers is :" + (a/b));
        System.out.println("the remainder of two numbers is :" + (a%b));
        sc.close();
    }
}