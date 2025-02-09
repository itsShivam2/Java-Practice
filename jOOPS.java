public class jOOPS {
    public static void main(String[] args) {
        // std1, std2 are reference variables while id,name and department are instance
        // variables
        Student std1 = new Student(1, "John", "CSE");
        Student std2 = new Student(2, "Jane", "ECE");
        Student std3 = new Student(std2);

        std1.greetings();
        std2.greetings();
        std3.greetings();

    }
}

class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // This is a default constructor. It can be used to create an empty object by
    // calling another constructor
    public Student() {
        this(0, "", "");
    }

    // This is a copy constructor which is used to create a copy of the object
    public Student(Student otherStudent) {
        this.id = otherStudent.id;
        this.name = otherStudent.name;
        this.department = otherStudent.department;
    }

    public void greetings() {
        System.out.println("Hello " + name);
        System.out.println("Your ID is " + this.id);
        System.out.println("Your department is " + department);
    }
}