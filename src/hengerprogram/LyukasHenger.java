package hengerprogram;

public class LyukasHenger extends TomorHenger{
    private double falvast;

    public LyukasHenger(double sugar, double magassag, double falvast) {
        this(sugar, magassag, 1, falvast);
    }
    
    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvast) {
        super(sugar, magassag, fajsuly);
        this.falvast = falvast;
    }

    public double getFalvast() {
        return falvast;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\t LyukasHenger{" + "falvast=" + falvast + '}';
        
    }
    
    @Override
    public double terfogat() {
        Henger belso = new Henger(this.getSugar() - falvast, getMagassag());
        return super.terfogat() - belso.terfogat();
    }
}
