# Frachtenverteilung

## Hintergrund

Du arbeitest für ein Logistikunternehmen, das täglich Lieferungen erhält. Jede Lieferung hat:

*   **ID** (eine eindeutige Zahl)
*   **Gewicht** (z.B. 500.00 kg)
*   **Ziel** (z.B. "New York")

Außerdem gibt es eine feste Anzahl von Lastwagen. Jeder Lastwagen hat:

*   Eine **ID**
*   Eine maximale **Kapazität** (zum Beispiel 1000.00)
*   Eine **aktuelle Beladung** (die anfangs 0 ist)
*   Eine Liste der IDs der zugewiesenen Lieferungen

- - -

## Aufgaben

### 1. Daten vorbereiten:

*   **Lieferungen:** Lege drei parallele Arrays an, zum Beispiel:

```
int[] shipmentIds = {1, 2, 3, 4, 5};
double[] shipmentWeights = {500.0, 300.0, 400.0, 600.0, 200.0};
String[] shipmentDestinations = {"New York", "Los Angeles", "New York", "Chicago", "Los Angeles"};
```

*   **Lastwagen:** Erstelle Arrays für die Lastwagendaten:

```
int truckCount = 5;
int[] truckIds = new int[truckCount];                   // z. B. {1, 2, 3, 4, 5}
double[] truckCapacities = new double[truckCount];      // alle auf 1000.00 setzen
double[] truckCurrentLoads = new double[truckCount];    // alle anfangs 0.0
```

Initialisiere diese Arrays in einer Schleife.

*   **Lieferungszuweisungen:** Anstelle eines Arrays von ArrayLists verwendest Du ein **zweidimensionales Array**. Das Array `truckAssignments` hat die Dimension `[truckCount][shipmentCount]` (das heißt, jeder Lastwagen könnte theoretisch alle Lieferungen aufnehmen). Zusätzlich führst Du ein Array `assignedCount` ein, das speichert, wie viele Lieferungen bisher einem Lastwagen zugewiesen wurden.

- - -

### 2. Zuweisung der Lieferungen:

Für jede Lieferung soll folgender Ablauf erfolgen:

1.  Durchlaufe alle Lastwagen und suche einen Lastwagen, der bereits eine Lieferung mit demselben Ziel hat und in dem die neue Lieferung noch hineinpasst. Falls mehrere Lastwagen passen, wähle denjenigen mit der geringsten verbleibenden Kapazität.
2.  Falls kein Lastwagen mit passendem Ziel gefunden wurde, durchlaufe alle Lastwagen erneut und weise die Lieferung dem ersten zu, in dem sie hineinpasst (wobei Du auch hier den Lastwagen mit der geringsten Restkapazität bevorzugst).
3.  Kann die Lieferung in keinen Lastwagen einsortiert werden, gib eine Fehlermeldung aus.

- - -

### 3. Ausgabe:

Gib zum Schluss für jeden Lastwagen aus:

*   Die Lastwagen-ID
*   Die aktuelle Beladung und die maximale Kapazität
*   Die verbleibende Kapazität
*   Die Liste der zugewiesenen Lieferungs-IDs

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!