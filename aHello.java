import java.util.Scanner;

public class aHello {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Hello, " + s);

        sc.close();
    }

}