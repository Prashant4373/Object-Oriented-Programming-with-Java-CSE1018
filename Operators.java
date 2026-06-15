import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("(a > b && b > 0) : " + (a > b && b > 0));
        System.out.println("(a < b || b > 0) : " + (a < b || b > 0));
        System.out.println("!(a > b) : " + !(a > b));

        // Unary Operators
        System.out.println("\nUnary Operators");
        int c = a;
        System.out.println("Original c = " + c);
        System.out.println("c++ = " + (c++));
        System.out.println("After c++ = " + c);
        System.out.println("--c = " + (--c));

        // Assignment Operators
        System.out.println("\nAssignment Operators");
        int d = a;
        d += b;
        System.out.println("d += b : " + d);
        d -= b;
        System.out.println("d -= b : " + d);
        d *= b;
        System.out.println("d *= b : " + d);
        d /= b;
        System.out.println("d /= b : " + d);

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));

        // Shift Operators
        System.out.println("\nShift Operators");
        System.out.println("a << 2 : " + (a << 2));
        System.out.println("a >> 2 : " + (a >> 2));
        System.out.println("a >>> 2 : " + (a >>> 2));

        // Ternary Operator
        System.out.println("\nTernary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Maximum number = " + max);

        sc.close();
    }
}