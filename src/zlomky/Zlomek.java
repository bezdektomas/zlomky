package zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
        vyresZnamenko();
        zkrat();
    }

    public Zlomek(int citatel) {
        this.citatel = citatel;
        this.jmenovatel = 1;
    }

    @Override
    public String toString() {
        if (jmenovatel == 1) {
            return "(" + citatel + ")(" + jmenovatel + ")";
        } else {
            return ("(" + citatel + ") / (" + jmenovatel + ")");
        }
    }

    private void zkrat() {
        int n = Util.nsd(this.citatel, this.jmenovatel);

        if (n > 1) {
            this.citatel /=  n;
            this.jmenovatel /= n;
        }
    }

    public Zlomek secti(Zlomek other) {
        int cit = this.citatel*other.jmenovatel + this.jmenovatel*other.citatel;
        int jmen = this.jmenovatel*other.jmenovatel;

        return new Zlomek(cit, jmen);
    }

    private void vyresZnamenko() {
        if (this.jmenovatel < 0)
        {
            this.citatel *= -1;
            this.jmenovatel *= -1;
        }
    }

    public Zlomek odecti(Zlomek other) {
        int cit = this.citatel*other.jmenovatel - this.jmenovatel*other.citatel;
        int jmen = this.jmenovatel*other.jmenovatel;

        return new Zlomek(cit, jmen);
    }
} 
