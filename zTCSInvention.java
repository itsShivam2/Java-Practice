import java.util.*;

public class zTCSInvention {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            int max = sc.nextInt();
            sc.nextLine();
            int current = sc.nextInt();
            sc.nextLine();
            int threshold = sc.nextInt();
            sc.nextLine();
            inventories[i] = new Inventory(id, max, current, threshold);
        }

        int limit = sc.nextInt();

        Inventory[] result = replenish(inventories, limit);
        if (result == null) {
            System.out.println("No such inventory");
        } else {
            for (Inventory inventory : result) {
                System.out.print(inventory.getid() + " ");
                if (inventory.getthreshold() > 75)
                    System.out.print("Critical Filling");
                else if (inventory.getthreshold() > 50 && inventory.getthreshold() <= 75)
                    System.out.print("Moderate Filling");
                else
                    System.out.print("Non-Critical Filling");
            }
        }

        sc.close();

    }

    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        List<Inventory> matchingInventories = new ArrayList<>();
        for (Inventory inventory : inventories) {
            if (inventory.getthreshold() > limit) {
                matchingInventories.add(inventory);
            }
        }
        if (matchingInventories.isEmpty()) {
            return null;
        } else
            return matchingInventories.toArray(new Inventory[0]);
    }

}

class Inventory {
    private int id;
    private int max;
    private int current;
    private int threshold;

    public Inventory(int id, int max, int current, int threshold) {
        this.id = id;
        this.max = max;
        this.current = current;
        this.threshold = threshold;
    }

    public int getid() {
        return id;
    }

    public int getmax() {
        return max;
    }

    public int getcurrent() {
        return current;
    }

    public int getthreshold() {
        return threshold;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setmax(int max) {
        this.max = max;
    }

    public void setcurrent(int current) {
        this.current = current;
    }

    public void setthreshold(int threshold) {
        this.threshold = threshold;
    }
}
