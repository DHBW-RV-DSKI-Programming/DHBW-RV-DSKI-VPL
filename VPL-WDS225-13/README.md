# Übungen für den Kurztest

## Übung 1: Pulsbereich berechnen

Schreibe ein Programm, das den Ruhepuls und den maximalen Puls eines Patienten einliest. Berechne den optimalen Pulsbereich mit folgender Formel:

*   **Unterer Wert:** 0.5 × (maximalerPuls - Ruhepuls) + Ruhepuls
*   **Oberer Wert:** 0.85 × (maximalerPuls - Ruhepuls) + Ruhepuls

- - -

## Übung 2: Temperaturanzeige formatieren

Ein Fieberthermometer gibt die Temperatur mit einer Nachkommastelle aus. Schreibe ein Programm, das eine Temperatur als `double` einliest und formatiert:

*   **Temperatur < 36.0:** Ausgabe „Untertemperatur"
*   **Temperatur 36.0 ≤ T ≤ 37.5:** Ausgabe „Normal“
*   **Temperatur > 37.5:** Ausgabe „Fieber“

- - -

## Übung 3: Medikamentenberechnung

Ein Medikament wird abhängig vom Körpergewicht eines Patienten dosiert: `2 mg pro kg Körpergewicht`  
Schreibe ein Programm, das das Gewicht (als `double`) einliest und die benötigte Dosis berechnet. Gebe das Ergebnis in ganzen Milligramm (als `int`) aus.

- - -

## Übung 4: Medikamentensicherheit prüfen

Ein Medikament darf nicht eingenommen werden, wenn:

*   Der Patient unter 18 Jahre alt ist, oder
*   Der Patient über 65 Jahre alt ist und gleichzeitig eine Herzfrequenz von über 90 hat.

Schreibe ein Programm, das Alter und Herzfrequenz einliest und prüft, ob die Einnahme sicher ist.

- - -

## Übung 5: Vitalparameter überprüfen

Ein Patient hat folgende Vitalparameter: Temperatur, Herzfrequenz und Blutdruck. Schreibe ein Programm, das überprüft, ob alle Werte im Normalbereich liegen:

*   **Temperatur:** 36.0 ≤ T ≤ 37.5
*   **Herzfrequenz:** 60 ≤ HF ≤ 100)
*   **Blutdruck:** 90 ≤ systolisch ≤ 120)

Gebe aus, ob der Patient „Stabil“ oder „Instabil“ ist.

- - -

## Übung 6: Bestandsverwaltung in der Apotheke

Ein Medikament wird in Packungen zu 20 Tabletten verkauft. Schreibe ein Programm, das die Anzahl der benötigten Tabletten (als `int`) einliest und berechnet:

*   Wie viele vollständige Packungen benötigt werden.
*   Wie viele Tabletten übrig bleiben.

**Beispiel:** Bei 45 Tabletten sind 2 Packungen notwendig, und 5 Tabletten bleiben übrig.

- - -

## Übung 7: Geschwindigkeit umrechnen

Schreibe ein Programm, das eine Geschwindigkeit in Kilometern pro Stunde (km/h) als `double` einliest und in Meter pro Sekunde (m/s) umrechnet:

v(m/s) = v(km/h)⁄3.6

- - -

## Übung 8: Kraftstoffverbrauch berechnen

Ein Auto verbraucht im Durchschnitt 7 Liter Kraftstoff pro 100 Kilometer. Schreibe ein Programm, das die Strecke (in km) einliest und berechnet:

*   Den verbrauchten Kraftstoff in Litern.
*   Die ungefähren Kosten (bei einem Preis von 1.60 €/Liter).

- - -

## Übung 9: Geschwindigkeitsüberschreitung prüfen

Schreibe ein Programm, das die gefahrene Geschwindigkeit und die erlaubte Höchstgeschwindigkeit einliest und überprüft:

*   **≤ Höchstgeschwindigkeit:** „Kein Verstoß“
*   **\> Höchstgeschwindigkeit:** „Geschwindigkeitsüberschreitung“

Berechne bei einem Verstoß auch das Bußgeld:

*   10 €/km/h bei Überschreitung bis 20 km/h.
*   20 €/km/h bei Überschreitung über 20 km/h.

- - -

## Übung 10: Parkgebühren berechnen

Ein Parkplatz verlangt folgende Gebühren:

*   Erste Stunde: 2 €
*   Jede weitere Stunde: 1.50 €

Schreibe ein Programm, das die geparkte Zeit (in Stunden, als `int`) einliest und die Gebühren berechnet.

- - -

## Übung 11: Autobahnmaut berechnen

Ein Auto wird je nach Schadstoffklasse unterschiedlich besteuert:

*   **Schadstoffklasse 1:** 5 €/100 km
*   **Schadstoffklasse 2:** 3 €/100 km
*   **Schadstoffklasse 3:** 1 €/100 km

Schreibe ein Programm, das die Schadstoffklasse und die gefahrene Strecke einliest und die Maut berechnet.

- - -

## Übung 12: Fahrzeuggewicht validieren

Schreibe ein Programm, das das Gewicht eines Fahrzeugs einliest und überprüft:

*   **< 0:** „Ungültiges Gewicht“
*   **0 ≤ Gewicht ≤ 3500:** „PKW“
*   **Gewicht > 3500:** „LKW“

- - -

## Übung 13: Warenwert berechnen

Schreibe ein Programm, das den Preis (als `double`) und die Menge (als `int`) eines Artikels einliest und den Gesamtpreis berechnet.

- - -

## Übung 14: Versandkosten berechnen

Ein Online-Shop berechnet Versandkosten wie folgt:

*   **Bestellwert < 50 €:** 5 € Versandkosten
*   **Bestellwert ≥ 50 €:** Kostenloser Versand

Schreibe ein Programm, das den Bestellwert einliest und die Gesamtkosten ausgibt.

- - -

## Übung 15: Rabatt berechnen

Ein Shop bietet folgende Rabatte an:

*   **Bestellwert ≥ 100 €:** 10 % Rabatt
*   **Bestellwert ≥ 200 €:** 20 % Rabatt

Schreibe ein Programm, das den Bestellwert einliest und den Endpreis berechnet.

- - -

## Übung 16: Bewertungskategorie ermitteln

Ein Produkt wird auf einer Skala von 1 bis 5 Sternen bewertet. Schreibe ein Programm, das die Bewertung einliest und interpretiert:

*   **1:** „Sehr schlecht“
*   **2:** „Schlecht“
*   **3:** „Durchschnittlich“
*   **4:** „Gut“
*   **5:** „Sehr gut“

- - -

## Übung 17: Umsatzsteuer berechnen

Schreibe ein Programm, das den Nettopreis eines Artikels einliest und den Bruttopreis berechnet (19 % Umsatzsteuer).

- - -

## Übung 18: Retourenquote berechnen

Ein Online-Shop hat 1.000 Bestellungen, von denen 150 zurückgeschickt wurden. Schreibe ein Programm, das die Retourenquote berechnet:

Retourenquote = (Retouren ÷ Bestellungen) × 100

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!