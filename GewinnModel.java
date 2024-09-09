import javax.swing.*;

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

    }
    public void berechneRunde(int spielerZahl){

    }
}
