# Smart Warehouse

## Hintergrund

Du entwickelst ein Monitoring-System für ein Rechenzentrum. Das System überwacht die Betriebstemperatur verschiedener Sensoren über eine Arbeitswoche (5 Tage). Pro Tag wird ein Durchschnittswert erfasst, welcher zwischen `10.0` und `60.0 °C` liegen muss.

- - -

## Deine Aufgabe

Schreibe ein `Python`-Programm, das folgende Schritte ausführt:

### 1. Anzahl der Sensoren eingeben

*   Frage nach der Gesamtzahl der installierten Sensoren.
*   Stelle sicher, dass die Anzahl mindestens 1 ist.

- - -

### 2. Sensordaten erfassen (für jeden Sensor)

*   **Sensoridentifikation:** Eindeutige Sensor-ID abfragen.
*   **Tägliche Messwerte für 5 Tage erfassen:**
    *   Frage pro Tag die Temperatur ab (`10.0` - `60.0 °C`).
    *   Nutze eine **Schleife** zur Validierung: Bei ungültigen Werten muss die Eingabe für den Tag wiederholt werden.
    *   Speichere alle gültigen Werte eines Sensors in einer `Liste`.
*   Daten auswerten:
    
    *   Berechne den Durchschnitt der Woche.
    *   Ermittle den Höchstwert der Woche.
    *   Zähle die kritischen Tage: Tage, an denen die Temperatur `> 35.0 °C` lag.
    
    Nutze eine Schleife, um die Liste der Messwerte zu verarbeiten.
    

- - -

### 3. Ergebnisse ausgeben

*   Gib die Sensor-ID, den Wochendurchschnitt und den Maximalwert aus.
*   Gib eine Warnung aus, wenn ein Sensor an 3 oder mehr Tagen kritische Werte gemeldet hat.

## Abgabe

Reiche alle Dateien als Zip ein. Viel Erfolg!