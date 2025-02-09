import java.util.*;

public class MathClassMethods {
    public static void main(String[] args) {

        int m = 10, n = 20;

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        System.out.println(Math.ceil(4.1));
        System.out.println(Math.ceil(4.9));

        System.out.println(Math.floor(4.1));
        System.out.println(Math.floor(4.9));

        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.round(4.1));
        System.out.println(Math.round(4.9));

        System.out.println(Math.sqrt(25));

        // Random - Returns a random number between 0.0 and 1.0
        System.out.println(Math.random());

        // To get a random integer number between 1 and 10
        System.out.println((int) (Math.random() * 10) + 1);

        // To get a random integer number between two numbers m and n
        System.out.println((int) (Math.random() * (n - m + 1) + m));
    }

}
