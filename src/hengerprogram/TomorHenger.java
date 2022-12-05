
package hengerprogram;

public class TomorHenger extends Henger{
    
    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }    

    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\t TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    public double suly() {
        return super.terfogat() * fajsuly;
    }
}
