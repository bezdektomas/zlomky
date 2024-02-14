package zlomky;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Zlomek z1 = new Zlomek(2, 5);
        Zlomek z2 = new Zlomek(6, 8);

        Zlomek z3 = new Zlomek(7, 14);
        Zlomek z4 = new Zlomek(3,2);

        System.out.println(z1 + " + " + z2 + " = " + z1.secti(z2));
        
        System.out.println(z1 + " + " + z2 + " = " + Util.sectiZlomky(z3, z4));


        List<Zlomek> z = new LinkedList<>();
        int n = 10;

        for (int i = 0; i < n; i++) {
            z.add(new Zlomek(i, i+1));
        }

        System.out.println("Kolekce zlomku:" + z);

    }
}