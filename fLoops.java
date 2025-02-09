public class fLoops {

    public static void main(String[] args) {

        // For Loop
        for (int i = 0; i < 10; i++)
            System.out.println(i);

        // While Loop
        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        // Do-While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        // Break and Continue
        // Break - Terminates the loop
        // Continue - Skips the current iteration
        System.out.println("Break and Continue");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;
            // continue;
        }

        // Labeled Break and Continue
        System.out.println("Labeled Break and Continue");
        int k = 0;
        outerloop: while (k < 10) {
            for (int l = 0; l < 10; l++) {
                System.out.println(k);
                k++;
                if (k == 5)
                    break outerloop;
                // continue outerloop;
            }
        }

        // For Each Loop
        // It works only for Arrays
        System.out.println("For Each Loop");
        String[] names = { "A", "B", "C" };
        for (String name : names) {
            System.out.println(name);
        }
    }

}
