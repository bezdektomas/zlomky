package zlomky;

import java.lang.Math;

public class Util {

    public static int nsd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int pom = b;
            b = a % b;
            a = pom;
        }
        return a;
    }

    public static Zlomek sectiZlomky(Zlomek z1, Zlomek z2) {
        return z1.secti(z2);
    }
    
}
