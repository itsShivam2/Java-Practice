import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class zTCSPhone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            phones[i] = new Phone(id, os, brand, price);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int totalPrice = findTotalPriceForBrand(phones, brand);
        if (totalPrice == 0) {
            System.out.println("No such brand");
        } else {
            System.out.println(totalPrice);
        }

        Phone[] matchingPhones = findPhoneIdsOnOs(phones, os);
        if (matchingPhones == null) {
            System.out.println("No such phone with the given OS");
        }
        else {
            for (Phone phone : matchingPhones) {
                System.out.println(phone.getid());
            }
        }

        sc.close();
    }

    public static int findTotalPriceForBrand(Phone[] phones, String brand) {
        int totalPrice = 0;
        for (Phone phone : phones) {
            if (phone.getbrand().equalsIgnoreCase(brand)) {
                totalPrice += phone.getprice();
            }
        }
        return totalPrice;
    }

    public static Phone[] findPhoneIdsOnOs(Phone[] phones, String os) {
        List<Phone> matchingPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone.getos().equalsIgnoreCase(os) && phone.getprice() >= 50000) {
                matchingPhones.add(phone);
            }
        }
        if (matchingPhones.isEmpty()) {
            return null;
        } else {
            return matchingPhones.toArray(new Phone[0]);
        }
    }
}

class Phone {
    private int id;
    private String os;
    private String brand;
    private int price;

    public Phone(int id, String os, String brand, int price) {
        this.id = id;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getid() {
        return id;
    }

    public String getos() {
        return os;
    }

    public String getbrand() {
        return brand;
    }

    public int getprice() {
        return price;
    }
}