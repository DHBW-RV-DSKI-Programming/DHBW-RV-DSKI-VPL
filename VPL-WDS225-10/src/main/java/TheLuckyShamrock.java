package main.java;

public class TheLuckyShamrock {

    public static void main(String[] args) {
        // Basispreise
        double preisBier = 4.50;
        double preisWhiskey = 7.00;
        double preisBurger = 8.00;
        double preisFishAndChips = 10.00;

        // Anzahl der bestellten Artikel
        int anzahlBiere = 4;
        int anzahlWhiskeys = 0;
        int anzahlBurger = 3;
        int anzahlFishAndChips = 0;

        boolean isHappyHour = true;

        // Berechnung des Basispreises
        double gesamtpreisGetraenke = preisBier * anzahlBiere + preisWhiskey * anzahlWhiskeys;
        double gesamtpreisSpeisen = preisBurger * anzahlBurger + preisFishAndChips * anzahlFishAndChips;

        // Kostenloses Bier 3 Burger
        if (anzahlBurger == 3) {
            anzahlBiere += 1;
        }

        // Kostenloses Whiskey 4 Fish and Chips
        if (anzahlFishAndChips == 4) {
            anzahlWhiskeys += 1;
        }

        // Runde Bier (10 Stück), wenn die Gesamtzahl der Artikel durch 4 teilbar ist
        int gesamtArtikel = anzahlBiere + anzahlWhiskeys + anzahlBurger + anzahlFishAndChips;
        if (gesamtArtikel % 4 == 0) {
            anzahlBiere += 10;
            gesamtpreisGetraenke += preisBier * 10;
        }

        // Rabatt für Speisen (5% bei mindestens 2 Portionen Fish and Chips)
        if (anzahlFishAndChips >= 2) {
            gesamtpreisSpeisen *= 0.95;
        }

        // Happy Hour für Getränke (15% Rabatt bei mehr als 3 Getränken)
        if (isHappyHour == true && anzahlBiere + anzahlWhiskeys > 3) {
            gesamtpreisGetraenke *= 0.85;
        }

        double gesamtpreis = gesamtpreisGetraenke + gesamtpreisSpeisen;

        // Mengenrabatt für Getränke (10% bei mehr als 5 Getränken)
        if (anzahlBiere + anzahlWhiskeys > 5) {
            gesamtpreis *= 0.9;
        }

        System.out.println("Anzahl Biere: " + anzahlBiere);
        System.out.println("Anzahl Whiskeys: " + anzahlWhiskeys);
        System.out.println("Anzahl Burger: " + anzahlBurger);
        System.out.println("Anzahl Fish and Chips: " + anzahlFishAndChips);
        System.out.println("Happy Hour: " + isHappyHour);

        System.out.println("--------------------");

        System.out.println("Getränke: " + gesamtpreisGetraenke + " Euro");
        System.out.println("Speisen: " + gesamtpreisSpeisen + " Euro");
        System.out.println("Endpreis: " + gesamtpreis + " Euro");
    }

}