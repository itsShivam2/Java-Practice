import java.util.*;

public class zTCSInstitute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institute[] institutes = new Institute[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int stdPlaced = sc.nextInt();
            sc.nextLine();
            int stdCleared = sc.nextInt();
            sc.nextLine();
            String location = sc.nextLine();

            institutes[i] = new Institute(id, name, stdPlaced, stdCleared, location);
        }

        String name = sc.nextLine();
        String location = sc.nextLine();

        int countStdCleared = stdClearedByLocation(institutes, location);
        if (countStdCleared == 0) {
            System.out.println("No such student from this location");
        } else {
            System.out.println(countStdCleared);
        }

        Institute institute = updateInstituteGrade(institutes, name);
        if (institute == null) {
            System.out.println("No such institute");
        } else {
            System.out.println(institute.getname() + " " + institute.getgrade());
        }

        sc.close();
    }

    public static int stdClearedByLocation(Institute[] institutes, String location) {
        int sum = 0;
        for (Institute institute : institutes) {
            if (institute.getlocation().equalsIgnoreCase(location)) {
                sum += institute.getstdCleared();
            }
        }
        return sum;
    }

    public static Institute updateInstituteGrade(Institute[] institutes, String name) {
        for (Institute institute : institutes) {
            if (institute.getname().equalsIgnoreCase(name)) {
                double rating = (institute.getstdPlaced() * 100.0) / institute.getstdCleared();
                if (rating > 80) {
                    institute.setgrade("A");
                } else {
                    institute.setgrade("B");
                }
                return institute;
            }
        }
        return null;
    }

}

class Institute {
    private int id;
    private String name;
    private int stdPlaced;
    private int stdCleared;
    private String location;
    private String grade;

    public Institute(int id, String name, int stdPlaced, int stdCleared, String location) {
        this.id = id;
        this.name = name;
        this.stdPlaced = stdPlaced;
        this.stdCleared = stdCleared;
        this.location = location;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getstdPlaced() {
        return stdPlaced;
    }

    public int getstdCleared() {
        return stdCleared;
    }

    public String getlocation() {
        return location;
    }

    public String getgrade() {
        return grade;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setstdPlaced(int stdPlaced) {
        this.stdPlaced = stdPlaced;
    }

    public void setstdCleared(int stdCleared) {
        this.stdCleared = stdCleared;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }
}
