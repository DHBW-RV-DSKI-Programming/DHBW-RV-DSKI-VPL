package main.java;

import java.util.Scanner;

public class HospitalVitalSignsMonitoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPatients;

        // 1. Anzahl der Patienten eingeben
        do {
            System.out.print("Gib die Anzahl der Patienten ein: ");
            numberOfPatients = scanner.nextInt();
        } while (numberOfPatients <= 0);

        // 2. Patientendaten erfassen
        for (int i = 1; i <= numberOfPatients; i++) {
            scanner.nextLine(); // Puffer leeren
            System.out.print("Gib den Namen des Patienten ein: ");
            String name = scanner.nextLine();

            System.out.print("Gib die Patienten-ID ein: ");
            String patientID = scanner.nextLine();

            int totalHeartRate = 0;
            int totalBloodPressure = 0;
            double totalTemperature = 0;
            int abnormalDays = 0;

            // 7-Tage Vitalzeichen erfassen
            for (int day = 1; day <= 7; day++) {
                System.out.println("Tag " + day + ":");

                int heartRate;
                do {
                    System.out.print("  Herzfrequenz (40-180 bpm): ");
                    heartRate = scanner.nextInt();
                } while (heartRate < 40 || heartRate > 180);

                int bloodPressure;
                do {
                    System.out.print("  Systolischer Blutdruck (80-200 mmHg): ");
                    bloodPressure = scanner.nextInt();
                } while (bloodPressure < 80 || bloodPressure > 200);

                double temperature;
                do {
                    System.out.print("  Körpertemperatur (35-42 °C): ");
                    temperature = scanner.nextDouble();
                } while (temperature < 35 || temperature > 42);

                totalHeartRate += heartRate;
                totalBloodPressure += bloodPressure;
                totalTemperature += temperature;

                // Abnormale Tage zählen
                if (heartRate < 60 || heartRate > 100 || bloodPressure < 90 || bloodPressure > 140 || temperature < 36 || temperature > 37.5) {
                    abnormalDays++;
                }
            }

            // Durchschnittswerte berechnen
            double avgHeartRate = totalHeartRate / 7.0;
            double avgBloodPressure = totalBloodPressure / 7.0;
            double avgTemperature = totalTemperature / 7.0;

            // Ergebnis ausgeben
            System.out.println("\nZusammenfassung für " + name + " (ID: " + patientID + "):");
            System.out.printf("  Durchschnittliche Herzfrequenz: %.2f bpm%n", avgHeartRate);
            System.out.printf("  Durchschnittlicher Blutdruck: %.2f mmHg%n", avgBloodPressure);
            System.out.printf("  Durchschnittliche Körpertemperatur: %.2f °C%n", avgTemperature);

            if (abnormalDays > 3) {
                System.out.println("  WARNUNG: Patient benötigt weitere medizinische Aufmerksamkeit!");
            }
            System.out.println();
        }
        scanner.close();
    }

}