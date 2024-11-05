public class bDataTypes {
    
    public static void main(String[] args) {
        boolean isStarted = true; // size is 1 byte
        byte b = 10;              // size is 1 byte
        short s = 10;             // size is 2 bytes
        int i = 10;               // size is 4 bytes
        long l = 10;              // size is 8 bytes
        float f = 10.0f;             // size is 4 bytes, store 6 decimal digits, by default double, need to add f at the end
        double d = 10.15;            // size is 8 bytes, store 15 decimal digits
        char c = 'A';             // size is 2 bytes
        String str = "Hello";     // size is 16 bytes
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
        int i2 = 10;
        long l2 = i2;
        System.out.println(l2);
        // Data Types Explicit Conversion/ Narrowing/ DownCasting
        double d1 = 10.15;
        int i1 = (int)d1;
        System.out.println(i1);
    }
}
