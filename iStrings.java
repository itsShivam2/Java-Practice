import java.util.*;

public class iStrings {
    // String: A sequence of characters stored as an object.

    // Strings in Java are immutable, meaning their values cannot be changed after
    // creation.
    // Although we can change the reference variable that points to the String
    // object or we can use the same reference variable to point to a new
    // String object. But the value of the original String object cannot be changed.
    // If we point to a new String object using the same reference variable and
    // there are no other references to the original String object then the original
    // String object will be garbage collected.

    // String is a reference data type and is stored in the heap memory.
    // It is a non-primitive data type.
    // An array of characters behaves similarly to a Java String.

    // Creation of a String:
    // 1. Using String Literal (Stored in the String Pool, which is part of the heap
    // memory and allows reuse of existing literals)
    // Reference variable is created in the stack and points to the String Literal
    // which is stored in the String Pool

    // 2. Using the new keyword (Forces object creation in the heap memory, even if
    // the same literal exists in the pool)
    // Reference variable is created in the stack and points to the String object
    // created in the heap

    public static void main(String[] args) {
        // Creating String using String Literal (stored in the String Pool in heap
        // memory)
        String str = "Hello";

        // Creating String using new keyword (stored in the heap memory but outside the
        // String Pool)
        String str2 = new String("Hello");

        // Comparing Strings
        String str3 = "Hello";
        String str4 = new String("Hello");

        // == compares the reference variables. If the reference variables point to the
        // same object then it returns true

        // To compare the values of the Strings, we need to use the equals() method
        // which returns true if the values of the Strings are equal

        System.out.println("Comparing Strings str and str2 : " + (str == str2));
        System.out.println("Comparing Strings str and str3 : " + (str == str3));
        System.out.println("Comparing Strings str2 and str4 : " + (str2 == str4));

        System.out.println("Comparing values of Strings str and str2 : " + str.equals(str2));
        System.out.println("Comparing values of Strings str2 and str3 : " + str.equals(str3));
        System.out.println("Comparing values of Strings str2 and str4 : " + str2.equals(str4));

        // Printing the Strings
        System.out.println("String using String Literal: " + str);
        System.out.println("String using new keyword: " + str2);

        // IMPORTANT
        // In case of Primitive Data Types, == compares the values of the variables. If
        // the values are equal then it returns true
        // In case of Reference Data Types, == compares the reference variables. If the
        // variables point to the same object then it returns true
        // If the variables point to different objects then it returns false
    }
}
