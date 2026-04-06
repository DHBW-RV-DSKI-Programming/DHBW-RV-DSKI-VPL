package main.java;

public class MedTechSolutions {

    public static void main(String[] args) {
        double testwert = 92.0;
        int anzahlEinheiten = 1000;
        double produktionswert = testwert * anzahlEinheiten;
        double bonus = 0.0;

        if (testwert < 50) {
            System.out.println("Charge abgelehnt");
        } else if (testwert >= 50 && testwert <= 70) {
            System.out.println("Nachprüfung erforderlich");
        } else {
            System.out.println("Medikament akzeptiert");
            if (testwert > 90) {
                bonus = 0.05 * produktionswert;
                System.out.println("Bonus: " + bonus + " Euro");
            }
        }
    }

}