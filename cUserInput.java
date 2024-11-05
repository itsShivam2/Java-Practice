import java.util.Scanner;

public class cUserInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();
        System.out.println("Your marks are " + marks);

        System.out.println("Enter your city: ");
        sc.nextLine();
        String city = sc.nextLine();
        System.out.println("Your city is " + city);

        System.out.println("Enter your country: ");
        String country = sc.nextLine();
        System.out.println("Your country is " + country);

        System.out.println("Enter your phone number: ");
        long phone = sc.nextLong();
        System.out.println("Your phone number is " + phone);

        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Your email is " + email);

        sc.close();
    }
}
