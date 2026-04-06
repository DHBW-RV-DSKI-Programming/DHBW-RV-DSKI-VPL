package main.java;

public class CargoDistribution {

    public static void main(String[] args) {
        // 1. Lieferungsdaten vorbereiten
        int[] shipmentIds = {1, 2, 3, 4, 5};
        double[] shipmentWeights = {500.0, 300.0, 400.0, 600.0, 200.0};
        String[] shipmentDestinations = {"New York", "Los Angeles", "New York", "Chicago", "Los Angeles"};
        int shipmentCount = shipmentIds.length;

        // 2. Lastwagendaten vorbereiten
        int truckCount = 5;
        int[] truckIds = new int[truckCount];
        double[] truckCapacities = new double[truckCount];
        double[] truckCurrentLoads = new double[truckCount];

        // Initialisierung der Lastwagen
        for (int t = 0; t < truckCount; t++) {
            truckIds[t] = t + 1;
            truckCapacities[t] = 1000.0;
            truckCurrentLoads[t] = 0.0;
        }

        // 3. Zuweisungen: Verwende ein 2D-Array für die zugewiesenen Lieferungen
        int[][] truckAssignments = new int[truckCount][shipmentCount]; // maximal möglich: alle Lieferungen pro Lastwagen
        int[] assignedCount = new int[truckCount]; // Zähler, wie viele Lieferungen bereits zugewiesen wurden

        // 4. Zuweisungsalgorithmus
        for (int s = 0; s < shipmentCount; s++) {
            int shipmentId = shipmentIds[s];
            double shipmentWeight = shipmentWeights[s];
            String shipmentDestination = shipmentDestinations[s];

            int selectedTruck = -1;
            double minRemainingCapacity = Double.MAX_VALUE;

            // 4.1. Suche nach einem Lastwagen, der schon eine Lieferung mit demselben Ziel hat.
            for (int t = 0; t < truckCount; t++) {
                boolean sameDestinationFound = false;
                for (int j = 0; j < assignedCount[t]; j++) {
                    int assignedShipmentId = truckAssignments[t][j];
                    // Finde den Index der zugewiesenen Lieferung in den Arrays
                    int index = -1;
                    for (int k = 0; k < shipmentCount; k++) {
                        if (shipmentIds[k] == assignedShipmentId) {
                            index = k;
                            break;
                        }
                    }
                    if (index != -1 && shipmentDestinations[index].equalsIgnoreCase(shipmentDestination)) {
                        sameDestinationFound = true;
                        break;
                    }
                }
                if (sameDestinationFound) {
                    double remaining = truckCapacities[t] - truckCurrentLoads[t];
                    if (remaining >= shipmentWeight && remaining < minRemainingCapacity) {
                        selectedTruck = t;
                        minRemainingCapacity = remaining;
                    }
                }
            }

            // 4.2. Falls kein Lastwagen mit demselben Ziel gefunden wurde, suche in allen Lastwagen.
            if (selectedTruck == -1) {
                for (int t = 0; t < truckCount; t++) {
                    double remaining = truckCapacities[t] - truckCurrentLoads[t];
                    if (remaining >= shipmentWeight && remaining < minRemainingCapacity) {
                        selectedTruck = t;
                        minRemainingCapacity = remaining;
                    }
                }
            }

            // 4.3. Zuweisung der Lieferung oder Fehlermeldung
            if (selectedTruck != -1) {
                // Lieferungs-ID im 2D-Array speichern
                truckAssignments[selectedTruck][assignedCount[selectedTruck]] = shipmentId;
                assignedCount[selectedTruck]++;
                truckCurrentLoads[selectedTruck] += shipmentWeight;
                System.out.println("Lieferung " + shipmentId + " (Ziel: " + shipmentDestination + ", Gewicht: "
                        + shipmentWeight + ") wurde zu Lastwagen " + truckIds[selectedTruck] + " hinzugefügt.");
            } else {
                System.out.println("Fehler: Lieferung " + shipmentId + " (Ziel: " + shipmentDestination
                        + ", Gewicht: " + shipmentWeight + ") konnte keinem Lastwagen zugewiesen werden.");
            }
        }

        // 5. Ausgabe der Ergebnisse
        System.out.println("\nErgebnis der Zuweisung:");
        for (int t = 0; t < truckCount; t++) {
            System.out.println("Lastwagen " + truckIds[t] + ":");
            System.out.println("  Aktuelle Beladung: " + truckCurrentLoads[t] + " von " + truckCapacities[t]);
            System.out.println("  Verbleibende Kapazität: " + (truckCapacities[t] - truckCurrentLoads[t]));
            System.out.print("  Zugewiesene Lieferungen: ");
            if (assignedCount[t] == 0) {
                System.out.println("Keine Lieferungen zugewiesen.");
            } else {
                for (int j = 0; j < assignedCount[t]; j++) {
                    System.out.print(truckAssignments[t][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------------------------");
        }
    }

}