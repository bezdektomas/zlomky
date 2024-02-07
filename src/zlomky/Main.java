package zlomky;

public class Main {

    public static void main(String[] args) {

        Zlomek z1 = new Zlomek(2, 5);
        Zlomek z2 = new Zlomek(6, 8);

        Zlomek z3 = new Zlomek(7, 14);
        Zlomek z4 = new Zlomek(3,2);

        System.out.println(z1 + " + " + z2 + " = " + z1.secti(z2));
        
        System.out.println(z1 + " + " + z2 + " = " + Util.sectiZlomky(z3, z4));

    }
}