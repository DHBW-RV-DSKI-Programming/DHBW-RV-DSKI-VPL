# Kniffel 🎲

## Ziel der Aufgabe

Implementiere das Würfelspiel **Kniffel** als textbasiertes Konsolenspiel in Java. Ziel ist die Anwendung und Vertiefung von Themen wie Methoden, Arrays, Schleifen und Benutzereingaben.

- - -

## Spielregeln im Überblick

*   **Ziel:** In 13 Runden die meisten Punkte durch Würfelkombinationen erzielen.
*   **Ablauf pro Runde:** Mit 5 Würfeln bis zu 3-mal würfeln. Nach jedem Wurf können beliebige Würfel für den nächsten Wurf behalten werden.
*   **Wertung:** Das Endergebnis der Runde muss in eine von 13 freien Kombinationen des Wertungsblocks eingetragen werden. Passt das Ergebnis nicht, wird die gewählte Kombination mit 0 Punkten "gestrichen".
*   **Wertungsblock:**
    *   **Oberer Teil:** Nur 1er bis 6er zählen. Bonus von 35 Punkten bei Erreichen von 63+ Punkten.
    *   **Unterer Teil:** Dreierpasch, Viererpasch, Full-House (25 P.), Kleine Straße (30 P.), Große Straße (40 P.), Kniffel (50 P.) und Chance (Summe aller Augen).

Für eine vollständige und korrekte Übersicht der Regeln siehe: [Kniffel - Schmidtspiele.de](https://www.schmidtspiele.de/files/Produkte/4/49030%20-%20Kniffel/49030_Kniffel_DE.pdf)

- - -

## Aufgabenstellung

Entwickel eine lauffähige Kniffel-Version für einen Spieler auf der Konsole. Strukturiere den Code sinnvoll in Methoden.

### Schritt 1: Die Würfel-Logik

Erstelle eine Methode, die den Wurf von 5 Würfeln simuliert und das Ergebnis in einem `int[]`\-Array speichert. Implementiere den kompletten Zug eines Spielers, der es erlaubt, Würfel zu behalten und bis zu zweimal neu zu würfeln. Frage den Benutzer über die Konsole, welche Würfel er behalten möchte.

### Schritt 2: Wertungstabelle & Auswertung

Stelle die Wertungstabelle dar (z.B. mit einem `String[]` für Namen und `int[]` für Punkte). Erstelle Methoden, die ein Würfelergebnis (`int[]`) entgegennehmen und die erreichbaren Punkte für jede Kombination (z.B. `isFullHouse(int[] dices)`) berechnen und zurückgeben.

**Tipp:** Nutze ggf. `java.util.Arrays.sort()` für Kombinationen des Würfel-Arrays.

### Schritt 3: Der Spielablauf

Programmiere in der `main`\-Methode die Haupt-Schleife, die 13 Runden läuft. Pro Runde:

1.  Spieler würfeln lassen (siehe Schritt 1).
2.  Finales Würfelergebnis und die noch freien Kombinationen anzeigen.
3.  Spieler eine Kombination wählen lassen.
4.  Punkte berechnen und in der Wertungstabelle eintragen.

### Schritt 4: Spielende

Nach 13 Runden das Spiel beenden. Berechne die Gesamtpunktzahl (inklusive Bonus) und gebe den finalen Wertungsblock aus.

- - -

## Hinweis

*   Zur Erzeugung von Zufallszahlen: `java.util.Random`

- - -

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!