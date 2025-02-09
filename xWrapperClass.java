import java.util.*;

public class xWrapperClass {

    public static void main(String args[]) {

        // Depracated
        Integer num = new Integer(12);

        // Best way
        Integer num2 = Integer.valueOf(1);

        // Autoboxing & Unboxing

        // Autoboxing - Automatic conversion of primitive data type to the object of
        // their corresponding wrapper class
        Integer num3 = 2;

        // Unboxing - Automatic conversion of an object of a wrapper class to its
        // corresponding primitive data type
        int num4 = num2;
        int num5 = num3;

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }

}
