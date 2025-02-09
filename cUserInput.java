import java.util.Scanner;

public class cUserInput {

    public static void main(String[] args) {

        // To use the Scanner class, we need to import it from java.util package.
        // After importing, we can create an object of the Scanner class to read input.
        // The Scanner object is linked to System.in, which represents standard input
        // (keyboard).
        Scanner sc = new Scanner(System.in);

        // The Scanner class has various methods to read different types of data from
        // the user.

        // 1. nextInt() - Used to take integer input.
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt(); // Reads an integer (e.g., 50000)
        System.out.println("Your salary is " + salary);

        // 2. nextFloat() - Used to take floating-point (decimal) input.
        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat(); // Reads a float value (e.g., 85.5)
        System.out.println("Your marks are " + marks);

        // 3. nextLong() - Used to take long integer input, useful for large numbers.
        System.out.println("Enter your phone number: ");
        long phone = sc.nextLong(); // Reads a long value (e.g., 1234567890)
        System.out.println("Your phone number is " + phone);

        // IMPORTANT POINT:
        // next() vs nextLine():
        // - next() is used to read a single word input (stops at space).
        // - nextLine() is used to read the entire line of input, including spaces.
        // So, next() should be used for single words, and nextLine() is better for full
        // sentences or names.

        // 4. next() - Reads a single word (stops at space or newline).
        System.out.println("Enter your email: ");
        String email = sc.next(); // Reads a single word (e.g., user@example.com)
        System.out.println("Your email is " + email);

        // 5. nextLine() - Reads an entire line of input, including spaces.
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Reads a full line (e.g., John Doe)
        System.out.println("Hello, " + name);

        // 6. nextBoolean() - Used to take a boolean input (true or false).
        System.out.println("Enter true or false: ");
        boolean statement = sc.nextBoolean(); // Reads a boolean value (true or false)
        System.out.println("Your answer is " + statement);

        // 7. nextDouble() - Used to take double (floating-point) input.
        System.out.println("Enter your height: ");
        double height = sc.nextDouble(); // Reads a double value (e.g., 5.9)
        System.out.println("Your height is " + height);

        // 8. nextByte() - Used to take a byte (small integer) input.
        System.out.println("Enter your age: ");
        byte age1 = sc.nextByte(); // Reads a byte value (e.g., 25)
        System.out.println("Your age is " + age1);

        // IMPORTANT POINT:
        // After using nextInt(), nextFloat(), nextDouble(), etc., the cursor sometimes
        // moves to the next line.
        // This can cause problems when we want to take a string input right after a
        // numeric input.
        // To fix this, use sc.nextLine() to consume the newline character left by
        // previous inputs.

        // Example: If you call nextInt() and then nextLine(), you may get an empty line
        // for nextLine().
        // You can solve this by adding a sc.nextLine() after reading a number to
        // consume the extra newline.

        // Closing the scanner after use is important.
        // The Scanner is a resource that uses memory, and closing it helps free up
        // resources when you're done.
        // The garbage collector will clean up the memory once the scanner is closed.
        // If you don't close it, the resource stays open and consumes memory
        // unnecessarily.
        sc.close();
    }
}
