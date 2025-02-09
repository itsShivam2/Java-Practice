public class hMethods {

    // Methods : A method is a block of code which provides a way to perform a
    // specific task. A method only runs when it is called.

    // Parameters vs Arguments
    // 1. Parameters:A parameter is a variable defined in the method’s signature
    // that acts as a placeholder for the value that will be passed into the method
    // when it is called. It is essentially a named entity in the method definition.
    // 2. Arguments : An argument is the actual value or data that you provide when
    // calling a method. It is passed into the method and corresponds to the
    // method's parameters.

    // Types of methods:
    // 1. Static methods : A static method is a method which is not associated
    // with any object of the class. It is called using the class name.

    // 2. Non-static methods : A non-static method is a method which is
    // associated with an object of the class. It is called using the object of
    // the class.

    // We can only call a static method from another static method.
    // If the method is not static, we need to create an object of the class
    // and then call the method.

    // Static method (also known as class methods)
    public static double averageTwo(int a, int b) {
        return (a + b) / 2.0;
    }

    // Non-static method
    public double averageThree(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        // Calling a static method directly using the class name
        System.out.println("Average of 10 and 20 is " + hMethods.averageTwo(10, 20));

        // Creating an object of the class to call a non-static method
        hMethods obj = new hMethods();

        // Calling the non-static method using the object
        System.out.println("Average of 10, 20, and 30 is " + obj.averageThree(10, 20, 30));
    }
}
