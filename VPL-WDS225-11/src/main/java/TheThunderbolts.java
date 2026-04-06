package main.java;

public class TheThunderbolts {

    public static void main(String[] args) {
        // Basiswerte
        int punkteProTD = 5;
        int punkteProFG = 2;
        int punkteProINT = 1;
        int extraBonus = 50;  // Zusätzlicher Bonus, wenn Punkte durch 7 teilbar
        double foulsAbzug = 0.20;  // 20% Abzug bei mehr als 3 Fouls
        double bonusProTouchdown = 0.10;  // 10% Bonus für mehr als 3 Touchdowns
        double zusatzBonusFG_INT = 0.05;  // 5% Zusatzbonus für FG und INT

        // Anzahl der erzielten Punkte
        int touchdowns = 3;
        int fieldGoals = 2;
        int interceptions = 1;
        int fouls = 4;

        // Berechnung des Basisbonus
        int gesamtPunkte = touchdowns * punkteProTD + fieldGoals * punkteProFG + interceptions * punkteProINT;
        double gesamtBonus = gesamtPunkte;

        // Zusatzboni anwenden
        if (touchdowns > 3) {
            gesamtBonus *= (1 + bonusProTouchdown);  // 10% Extra für mehr als 3 Touchdowns
        }

        if (fieldGoals >= 1 && interceptions >= 1) {
            gesamtBonus *= (1 + zusatzBonusFG_INT);  // 5% Extra für FG und INT
        }

        // Abzüge anwenden
        if (fouls > 3) {
            gesamtBonus *= (1 - foulsAbzug);  // 20% Abzug für mehr als 3 Fouls
        }

        // Extra Bonus, wenn die Gesamtpunktzahl durch 7 teilbar ist
        if (gesamtPunkte % 7 == 0) {
            gesamtBonus += extraBonus;  // 50 Punkte Bonus
        }

        System.out.println("Bonus: " + gesamtBonus);
    }

}