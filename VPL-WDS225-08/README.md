# Vitalzeichen-Krankenhauspatienten

## Hintergrund

Du entwickelst ein einfaches Überwachungssystem für ein Krankenhaus. Das System erfasst die Vitalzeichen jedes Patienten über 7 Tage. Pro Tag werden folgende Werte gemessen:

*   **Herzfrequenz** (40 – 180 Schläge/Min.)
*   **Systolischer Blutdruck** (80 – 200 mmHg)
*   **Körpertemperatur** (35 – 42 °C)

- - -

## Deine Aufgabe

Schreibe ein Java-Programm, das folgende Schritte ausführt:

### 1. Anzahl der Patienten eingeben

*   Frage nach der Gesamtzahl der Patienten.
*   Nutze eine **Schleife**, um sicherzustellen, dass die Zahl positiv ist.

- - -

### 2. Patientendaten erfassen (für jeden Patienten)

*   **Patientenidentifikation:** Name und ID abfragen.
*   **Tägliche Messwerte für 7 Tage erfassen:**

    *   Herzfrequenz (40 – 180 Schläge/Min.)
    *   Systolischer Blutdruck (80 – 200 mmHg)
    *   Körpertemperatur (35 – 42 °C)

    Nutze eine **Schleife**, um Eingaben zu validieren.

*   **Daten auswerten:**

    *   Werte summieren und Durchschnitt berechnen.
    *   Abnormale Tage zählen:
        *   **Herzfrequenz** < 60 oder > 100
        *   **Blutdruck** < 90 oder > 140
        *   **Temperatur** < 36 oder > 37,5

    Nutze eine **Schleife**, um alle 7 Tage zu durchlaufen.


- - -

### 3. Ergebnisse ausgeben

*   Durchschnittswerte berechnen und anzeigen.
*   Warnung ausgeben, wenn mehr als 3 Tage abnormale Werte hatten.

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!