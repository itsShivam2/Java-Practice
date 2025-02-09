import java.util.*;

public class zTCSMedicine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];

        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            medicines[i] = new Medicine(name, batch, disease, price);
        }

        String disease = sc.nextLine();

        int price = getPriceByDisease(medicines, disease);

        if (price == 0)
            System.out.println("No such medicine");
        else
            System.out.println(price);

        sc.close();
    }

    public static int getPriceByDisease(Medicine[] medicines, String disease) {
        for (Medicine medicine : medicines) {
            if (medicine.getdisease().equalsIgnoreCase(disease)) {
                return medicine.getprice();
            }
        }

        // If no matching medicine is found, return 0
        return 0;
    }
}

class Medicine {
    private String name;
    private String batch;
    private String disease;
    private int price;

    // Constructor to initialize Medicine object
    public Medicine(String name, String batch, String disease, int price) {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public String getbatch() {
        return batch;
    }

    public String getdisease() {
        return disease;
    }

    public int getprice() {
        return price;
    }

    // Setters for the Medicine attributes
    public void setname(String name) {
        this.name = name;
    }

    public void setbatch(String batch) {
        this.batch = batch;
    }

    public void setdisease(String disease) {
        this.disease = disease;
    }

    public void setprice(int price) {
        this.price = price;
    }
}
