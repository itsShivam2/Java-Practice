import java.util.Scanner;

public class eConditionalOperartors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // If-else Operator
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");

            // If-else-if Operator
            if (num > 0) {
                System.out.println("Number is positive");
            } else if (num < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

            // Switch Case
            switch (num) {
                case 0:
                    System.out.println("Number is zero");
                    break;
                case 1:
                    System.out.println("Number is one");
                    break;
                case 2:
                    System.out.println("Number is two");
                    break;
                default:
                    System.out.println("Number is negative");
                    break;
            }

            // Ternary Operator
            String result = (num > 0) ? "Number is positive" : "Number is negative";
            System.out.println(result);

            sc.close();
        }
    }
}
