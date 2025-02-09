import java.util.Scanner;

// There can only be one public class in a file
// Class name should be the same as the file name. This is because if there are multiple classes, byte code will be generated for each class as the entry point of the program won't be known. To avoid this, we can have the class name same as the file name
// Class name should start with an uppercase letter
public class aHello {

    // There can be multiple public methods in a class
    // There can be multiple main methods

    // Main method which has the signature void main(String[] args) is the entry
    // point of the program
    public static void main(String[] args) {

        // Variables are named memory locations which are used to store data
        // Variable names are case-sensitive
        // Variable names can contain letters, digits, dollar signs and underscores
        // Variable name must start with a letter, dollar sign or underscore

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Hello, " + s);

        main();

        sc.close();
    }

    public static void main() {
        System.out.println("Hello, World!");
    }

}