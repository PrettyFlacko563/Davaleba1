public class Fraction {
    private int numenator;
    private int denominator;

    Fraction(int numenator, int denominator) {
        this.numenator = numenator;
        this.denominator = denominator;

    }

    public int getNumenator() {
        return numenator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void prettyyyyy(int n) {
        if (n == 0) {
            return;
        }
        this.numenator *= n;
        this.denominator *= n;

        System.out.println(this.numenator + "/" + this.denominator);
    }

    public void printfraction() {
        System.out.println(this.numenator + "/" + this.denominator);

    }


    public void gayofashekveca() {
        if (denominator % numenator == 0) {
            int nnum = numenator / numenator;
            int ndeno = denominator / denominator;

            System.out.println(nnum + "/" + ndeno);
        }
        else {
            System.out.println("mocemuli ciladi ar ikveceba bratuxa");
        }
    }
    public void mimateba(Fraction r) {

        if (r.denominator == this.denominator){
            int newnumerator = this.numenator + r.numenator;
            int newdenominator = this.denominator + r.denominator;

            System.out.println(newnumerator + "/" + newdenominator);
        }
        else {
            int saerto_jeradi = r.denominator * this.denominator;
            int out = (this.numenator * r.denominator) + (r.numenator * this.denominator);
            System.out.println(out + "/" + saerto_jeradi);
        }
    }

    public void gamravleba(Fraction g) {
        if (this.numenator == g.numenator) {
            int rame = this.denominator * g.denominator;
            System.out.println(this.numenator + "/" + rame);
        }
        else {
            int rame = this.numenator * g.numenator;
            int rume = this.denominator * g.denominator;

            System.out.println(rame + "/" + rume);
        }
    }
}