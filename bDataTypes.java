public class bDataTypes {

    static int var = 9;
    int varb = 9;

    public static void main(String[] args) {
        boolean isStarted = true; // size is 1 bit
        byte b = 10; // size is 1 byte
        short s = 10; // size is 2 bytes
        int i = 10; // size is 4 bytes
        long l = 10; // size is 8 bytes
        float f = 10.0f; // size is 4 bytes, store 6 decimal digits, by default double, need to add f at
                         // the end
        double d = 10.15; // size is 8 bytes, store 15 decimal digits
        char c = 'A'; // size is 2 bytes
        String str = "Hello"; // size is 16 bytes

        System.out.println(var);

        // System.out.println(varb); // This gives error because we cannot access not
        // stativ variable from a static method directly. To access we need to create an
        // instance of the class and then access the variable using that instance

        System.out.println(isStarted);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);

        // Data Types Implicit Conversion/ Widening/ UpCasting/ Type Promotion
        // Converting a small data type to a larger data type
        int i2 = 10;
        long l2 = i2;
        System.out.println(l2);

        // Data Types Explicit Conversion/ Narrowing/ DownCasting
        // Converting a larger data type to a smaller data type
        double d1 = 10.15;
        int i1 = (int) d1;
        System.out.println(i1);

        // Lossy Conversion - Converting a smaller data type to a larger data type
        // without type casting will give a compilation error
        // int i3 = 10;
        // short d2 = i3;
        // System.out.println(d2);
    }
}
