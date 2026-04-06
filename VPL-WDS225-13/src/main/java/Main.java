package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Übung 1: Pulsbereich berechnen
        System.out.println("Übung 1: Pulsbereich");
        System.out.print("Ruhepuls: ");
        int ruhepuls = scanner.nextInt();
        System.out.print("Maximaler Puls: ");
        int maxPuls = scanner.nextInt();
        double untererWert = 0.5 * (maxPuls - ruhepuls) + ruhepuls;
        double obererWert = 0.85 * (maxPuls - ruhepuls) + ruhepuls;
        System.out.println("Optimaler Bereich: " + untererWert + " bis " + obererWert);

        // Übung 2: Temperaturanzeige formatieren
        System.out.println("\nÜbung 2: Temperaturanzeige");
        System.out.print("Temperatur eingeben: ");
        double temp = scanner.nextDouble();
        if (temp < 36.0) {
            System.out.println("Untertemperatur");
        } else if (temp <= 37.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Fieber");
        }

        // Übung 3: Medikamentenberechnung
        System.out.println("\nÜbung 3: Medikamentendosis");
        System.out.print("Körpergewicht (kg): ");
        double gewicht = scanner.nextDouble();
        int dosis = (int) (gewicht * 2);
        System.out.println("Benötigte Dosis: " + dosis + " mg");

        // Übung 4: Medikamentensicherheit prüfen
        System.out.println("\nÜbung 4: Medikamentensicherheit");
        System.out.print("Alter: ");
        int alter = scanner.nextInt();
        System.out.print("Herzfrequenz: ");
        int hfSicherheit = scanner.nextInt();
        if (alter < 18 || (alter > 65 && hfSicherheit > 90)) {
            System.out.println("Einnahme NICHT sicher.");
        } else {
            System.out.println("Einnahme sicher.");
        }

        // Übung 5: Vitalparameter überprüfen
        System.out.println("\nÜbung 5: Vitalparameter");
        System.out.print("Temperatur: ");
        double vTemp = scanner.nextDouble();
        System.out.print("Herzfrequenz: ");
        int vHF = scanner.nextInt();
        System.out.print("Blutdruck (systolisch): ");
        int vBlutdruck = scanner.nextInt();
        if ((vTemp >= 36.0 && vTemp <= 37.5) && (vHF >= 60 && vHF <= 100) && (vBlutdruck >= 90 && vBlutdruck <= 120)) {
            System.out.println("Status: Stabil");
        } else {
            System.out.println("Status: Instabil");
        }

        // Übung 6: Bestandsverwaltung Apotheke
        System.out.println("\nÜbung 6: Packungsberechnung");
        System.out.print("Anzahl Tabletten: ");
        int tabletten = scanner.nextInt();
        int packungen = tabletten / 20;
        int restTabletten = tabletten % 20;
        System.out.println("Vollständige Packungen: " + packungen);
        System.out.println("Übrig bleibende Tabletten: " + restTabletten);

        // Übung 7: Geschwindigkeit umrechnen
        System.out.println("\nÜbung 7: km/h in m/s");
        System.out.print("Geschwindigkeit (km/h): ");
        double kmh = scanner.nextDouble();
        double ms = kmh / 3.6;
        System.out.println("Geschwindigkeit in m/s: " + ms);

        // Übung 8: Kraftstoffverbrauch berechnen
        System.out.println("\nÜbung 8: Kraftstoffverbrauch");
        System.out.print("Strecke (km): ");
        double strecke = scanner.nextDouble();
        double verbrauch = (strecke / 100) * 7;
        double kosten = verbrauch * 1.60;
        System.out.println("Verbrauch: " + verbrauch + " Liter, Kosten: " + kosten + " €");

        // Übung 9: Geschwindigkeitsüberschreitung prüfen
        System.out.println("\nÜbung 9: Bußgeldrechner");
        System.out.print("Gefahrene Geschwindigkeit: ");
        int speed = scanner.nextInt();
        System.out.print("Erlaubt: ");
        int limit = scanner.nextInt();
        if (speed <= limit) {
            System.out.println("Kein Verstoß");
        } else {
            int differenz = speed - limit;
            int bussgeld = (differenz <= 20) ? (differenz * 10) : (differenz * 20);
            System.out.println("Geschwindigkeitsüberschreitung! Bußgeld: " + bussgeld + " €");
        }

        // Übung 10: Parkgebühren berechnen
        System.out.println("\nÜbung 10: Parkgebühren");
        System.out.print("Parkzeit (Stunden): ");
        int stunden = scanner.nextInt();
        double gebuehr = 0;
        if (stunden > 0) {
            gebuehr = 2.0 + (stunden - 1) * 1.50;
        }
        System.out.println("Gebühr: " + gebuehr + " €");

        // Übung 11: Autobahnmaut berechnen
        System.out.println("\nÜbung 11: Autobahnmaut");
        System.out.print("Schadstoffklasse (1, 2 oder 3): ");
        int klasse = scanner.nextInt();
        System.out.print("Strecke (km): ");
        double mautStrecke = scanner.nextDouble();
        double mautPro100 = 0;
        if (klasse == 1) mautPro100 = 5;
        else if (klasse == 2) mautPro100 = 3;
        else if (klasse == 3) mautPro100 = 1;
        double mautGesamt = (mautStrecke / 100) * mautPro100;
        System.out.println("Maut: " + mautGesamt + " €");

        // Übung 12: Fahrzeuggewicht validieren
        System.out.println("\nÜbung 12: Fahrzeuggewicht");
        System.out.print("Gewicht (kg): ");
        double fahrzeugGewicht = scanner.nextDouble();
        if (fahrzeugGewicht < 0) System.out.println("Ungültiges Gewicht");
        else if (fahrzeugGewicht <= 3500) System.out.println("PKW");
        else System.out.println("LKW");

        // Übung 13: Warenwert berechnen
        System.out.println("\nÜbung 13: Warenwert");
        System.out.print("Preis: ");
        double preisArt = scanner.nextDouble();
        System.out.print("Menge: ");
        int mengeArt = scanner.nextInt();
        System.out.println("Gesamtpreis: " + (preisArt * mengeArt));

        // Übung 14: Versandkosten berechnen
        System.out.println("\nÜbung 14: Versandkosten");
        System.out.print("Bestellwert: ");
        double bestellwert = scanner.nextDouble();
        double versand = (bestellwert < 50) ? 5.0 : 0.0;
        System.out.println("Gesamtkosten: " + (bestellwert + versand));

        // Übung 15: Rabatt berechnen
        System.out.println("\nÜbung 15: Rabatt");
        System.out.print("Bestellwert: ");
        double bWert = scanner.nextDouble();
        if (bWert >= 200) bWert *= 0.8;
        else if (bWert >= 100) bWert *= 0.9;
        System.out.println("Endpreis: " + bWert);

        // Übung 16: Bewertungskategorie
        System.out.println("\nÜbung 16: Bewertung");
        System.out.print("Sterne (1-5): ");
        int sterne = scanner.nextInt();
        switch (sterne) {
            case 1: System.out.println("Sehr schlecht"); break;
            case 2: System.out.println("Schlecht"); break;
            case 3: System.out.println("Durchschnittlich"); break;
            case 4: System.out.println("Gut"); break;
            case 5: System.out.println("Sehr gut"); break;
            default: System.out.println("Ungültige Eingabe");
        }

        // Übung 17: Umsatzsteuer berechnen
        System.out.println("\nÜbung 17: Umsatzsteuer");
        System.out.print("Nettopreis: ");
        double netto = scanner.nextDouble();
        double brutto = netto * 1.19;
        System.out.println("Bruttopreis: " + brutto);

        // Übung 18: Retourenquote berechnen
        System.out.println("\nÜbung 18: Retourenquote");
        System.out.print("Bestellungen: ");
        int bestellungenTotal = scanner.nextInt();
        System.out.print("Retouren: ");
        int retourenTotal = scanner.nextInt();
        double quote = ((double) retourenTotal / bestellungenTotal) * 100;
        System.out.println("Retourenquote: " + quote + " %");

        scanner.close();
    }
}