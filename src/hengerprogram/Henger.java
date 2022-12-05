
package hengerprogram;

public class Henger {
    private static int hengerDb;
    private double sugar;
    private double magassag;

    public static int getHengerDb() {
        return hengerDb;
    }
    
    public Henger(double sugar, double magassag) {
        if (sugar <= 0) {sugar = 1;}
        if (magassag <= 0) {magassag = 1;}
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDb++;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    public double terfogat() {
        return Math.pow(sugar, 2) * Math.PI * magassag;
    }
}
