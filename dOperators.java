import java.util.Scanner;

public class dOperators {
    
    public static void main(String[] args) {
        // Types of Operators
        // 1. Arithmetic Operators
        // 2. Assignment Operators
        // 3. Comparison Operators
        // 4. Logical Operators
        // 5. Bitwise Operators
        // 6. Unary Operators

        // Arithmetic Operators => + - * / %
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Assignment Operators => = += -= *= /= %=
        int c = 10;
        c += 5;
        System.out.println(c);
        c -= 5;
        System.out.println(c);
        c *= 5;
        System.out.println(c);
        c /= 5;
        System.out.println(c);
        c %= 5;
        System.out.println(c);

        // Comparison Operators => > < >= <= == !=
        int d = 10;
        int e = 20;
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e);
        System.out.println(d <= e);
        System.out.println(d == e);
        System.out.println(d != e);

        // Logical Operators => && || !
        int f = 10;
        int g = 20;
        System.out.println(f > e && f < g);
        System.out.println(f > e || f < g);

        // Bitwise Operators => & | ^ ~ << >> >>>     (<< is left shift operator, >> is right shift operator)
        // Bitwise operator is used to perform bitwise operations on individual bits of a number.
        // The result of the bitwise operation is a number with the same number of bits as the operands.
        // The result is 0 if the operation is not performed on the bit and 1 if the operation is performed on the bit.
        // The bitwise operators are used to perform operations on individual bits of a number.
        // The result of the bitwise operation is a number with the same number of bits as the operands.

        // Unary Operators => ++ --
        int h = 10;
        System.out.println(h++);
        System.out.println(h--);
        System.out.println(++h);
        System.out.println(--h);
        
        // Ternary/Conditional Operator
        int i = 10;
        int j = 20;
        int k = i > j ? i : j;
        System.out.println(k);

        sc.close();

    }
}
