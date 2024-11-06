import java.util.*;

public class zTCSProjector {

    public static void main(String arge[]) {

        Scanner sc = new Scanner(System.in);
        Projector[] projectors = new Projector[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            String store = sc.nextLine();

            projectors[i] = new Projector(id, name, price, rating, store);
        }

        int rating = sc.nextInt();

        Projector maxProjector = getMaxProjectorByRating(projectors, rating);

        if (maxProjector == null)
            System.out.println("No such projector");
        else
            System.out.println(maxProjector.getid());

        sc.close();

    }

    public static Projector getMaxProjectorByRating(Projector[] projectors, int rating) {
        int max = Integer.MIN_VALUE;
        Projector maxProjector = null;
        for (Projector projector : projectors) {
            if (projector.getrating() > rating && projector.getstore().equalsIgnoreCase("TataCliq")
                    && projector.getprice() > max) {
                max = projector.getprice();
                maxProjector = projector;
            }
        }
        return maxProjector;
    }
}

class Projector {
    private int id;
    private String name;
    private int price;
    private int rating;
    private String store;

    public Projector(int id, String name, int price, int rating, String store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.store = store;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getprice() {

        return price;
    }

    public int getrating() {

        return rating;
    }

    public String getstore() {
        return store;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setrating(int rating) {
        this.rating = rating;
    }

    public void setstore(String store) {
        this.store = store;
    }
}
