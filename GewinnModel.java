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

    public void setGesamtPunkte(int gesamtPunkte) {
        this.gesamtPunkte = gesamtPunkte;
    }

    public int getSpielerZahl() {
        return spielerZahl;
    }

    public void setSpielerZahl(int spielerZahl) {
        this.spielerZahl = spielerZahl;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public void setComputerZahl(int computerZahl) {
        this.computerZahl = computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void setRundenErgebnis(int rundenErgebnis) {
        this.rundenErgebnis = rundenErgebnis;
    }

    public static void main(String[] args) {

    }
}
