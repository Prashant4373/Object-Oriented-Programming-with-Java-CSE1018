//taking name and age as input from user 
import java.util.*;
public class third {
    public static void main(String args []){
        Scanner sc = new Scanner (System .in);
        System.out.print("enter your name :");
        String name = sc .nextLine ();
        System .out.print("enter your age :");
        int age = sc .nextInt();
        System.out.println("your name is :" + name);
        System.out.println("your age is :" + age);
        sc.close();
    }}      