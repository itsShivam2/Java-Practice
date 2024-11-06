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

    public static int[] getPriceByDisease(Medicine[] medicines, String disease) {
        // int[] arr = new int[0];
        // for (int i = 0; i < medicines.length; i++) {
        //     if (medicines[i].getdisease().equalsIgnoreCase(disease)) {
        //         arr = Arrays.copyOf(arr, arr.length + 1);
        //         arr[arr.length - 1] = medicines[i].getprice();

        //     }
        // }
        List<Integer> matchingPrices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getdisease().equalsIgnoreCase(disease)) {
                matchingPrices.add(medicine.getprice());
            }
            if (matchingPrices.isEmpty())
                return null;
            else
                return matchingPrices.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

class Medicine {
    private String name;
    private String batch;
    private String disease;
    private int price;

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
