
package hengerprogram;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }

    private void run() {
        System.out.println("Hengerek: ");
        for (Henger henger : lista()) {
            System.out.println(henger);
        }
        
        double atlagV = atlagTerfogat();
        double csovekS = csovekSulya();
        System.out.println("Átlag térfogat: " + atlagV);
        System.out.println("Csövek Súlya: " + csovekS);
    }
    
    public double atlagTerfogat() {
        double osszV = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            osszV += hengerek.get(i).terfogat();
        }
        return osszV / Henger.getHengerDb();
    }
    
    public  double csovekSulya() {
        double osszSuly = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            Henger h = hengerek.get(i);
            if (h instanceof LyukasHenger) {
                osszSuly += ((LyukasHenger) h).suly();
            }
        }
        return osszSuly;
    }
    
    private void HengerProgram() {
        hengerek = new ArrayList();
        hengerek.add(new Henger(0, 0));
        hengerek.add(new TomorHenger(0, 0));
        hengerek.add(new LyukasHenger(0, 0, 0.5));
    }
    
    private List<Henger> lista() {
        return hengerek;
    }
}
