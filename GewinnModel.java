import javax.swing.*;
import java.util.Random;

public class GewinnModel extends JFrame {

    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;


    public GewinnModel() {
        super("Gewinnspiel");
        super.setVisible(true);
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getSpielerZahl() {
        return spielerZahl;
    }


    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl(){
        Random rand = new Random();
        this.computerZahl = rand.nextInt(0, 9);
    }
    public void berechneRunde(int spielerZahl){
        if(spielerZahl == this.computerZahl){
            gesamtPunkte = gesamtPunkte + 20;
        }
        if(spielerZahl == computerZahl +1 || spielerZahl == computerZahl -1){
            gesamtPunkte = gesamtPunkte +5;
        }
        else{
            gesamtPunkte = gesamtPunkte -10;
        }

    }
}
