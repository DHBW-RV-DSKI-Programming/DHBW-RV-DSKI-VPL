# Budget-Tracker

## Ziel der Aufgabe

Entwickle einen **Budget-Tracker** als Konsolenanwendung, mit dem du deine Einnahmen und Ausgaben verwalten kannst – ausschließlich im Arbeitsspeicher. Die Anwendung soll dir einen Überblick über deine Finanzen geben und Monatsberichte erstellen.

**Wichtig:** Es dürfen keine Rundungs- oder Berechnungsfehler auftreten. Schwäbisch gesehen ist jeder Cent wichtig 💰.

- - -

## Aufgabenstellung

### Grundfunktionen

Erstelle eine Funktion, mit der du Einnahmen und Ausgaben erfassen kannst. Jeder Eintrag soll folgende Informationen enthalten:

*   **Datum** (z. B. als String im Format "YYYY-MM-DD")
*   _Optional:_ Verwende Datumsklassen wie `LocalDate`.
*   **Kategorie** (z. B. Gehalt, Lebensmittel, Freizeit, Miete, etc.)
*   **Betrag** (positiv für Einnahmen, negativ für Ausgaben)

Alle Einträge werden in einer geeigneten Datenstruktur gespeichert.

### Funktionen zur Datenanalyse:

Monatliche Übersicht: Implementiere eine Methode, die für einen ausgewählten Monat die Gesamtsumme der Einnahmen, Ausgaben und den daraus resultierenden Saldo berechnet und anzeigt.

Kategorien-Analyse: Ermittle, wie viel in den verschiedenen Kategorien (z. B. Lebensmittel, Miete, Freizeit) ausgegeben oder eingenommen wurde, und stelle dies übersichtlich dar.

- - -

## Benutzerinteraktion

Erstelle ein Menü, das den Nutzer durch die Funktionen führt, z. B.:

*   Eintrag erfassen
*   Monatsbericht anzeigen
*   Programm beenden

### Eingabevalidierung

Achte darauf, dass nur gültige Eingaben akzeptiert werden (z. B. korrekte Datumsangaben, numerische Werte für Beträge). Bei ungültigen Eingaben soll der Nutzer erneut aufgefordert werden.

- - -

## Optionale Erweiterungen

### Budgetvorgaben

Ermögliche dem Nutzer, für bestimmte Kategorien monatliche Budgetgrenzen festzulegen. Zeige eine Warnung an, wenn in einer Kategorie der festgelegte Betrag überschritten wird.

### Zusätzliche Berichte

Implementiere weitere Auswertungen, beispielsweise:

*   Anzeige der häufigsten Ausgabenkategorien
*   Vergleich verschiedener Monate

- - -

## Erwartete Ein- und Ausgabe (Beispiel)

### Hauptmenü:

```
Willkommen beim Budget-Tracker!
--------------------------------
1. Einnahme/Ausgabe erfassen
2. Monatsbericht anzeigen
3. Programm beenden
   Bitte wähle eine Option (1-3):
```

### Eintrag erfassen:

```
Gib das Datum ein (z.B. 2025-03-15): 2025-03-15
Gib die Kategorie ein (z.B. Lebensmittel, Gehalt, Miete, ...): Lebensmittel
Gib den Betrag ein (negativ für Ausgaben, positiv für Einnahmen): -45.90
Beschreibung (optional): Wocheneinkauf im Supermarkt
Eintrag gespeichert!
```

### Monatsbericht:

```
Monatsbericht für März 2025
------------------------------------
Gesamteinnahmen: +2500.00 €
Gesamtausgaben: -1800.00 €
Saldo: +700.00 €
Ausgaben nach Kategorie:
- Lebensmittel: -300.00 €
- Miete: -800.00 €
- Freizeit: -200.00 €
```

- - -

## Weitere Ideen

*   Implementiere eine Funktion, um Einträge zu löschen oder zu bearbeiten.
*   Berechne Durchschnittswerte und Trends über mehrere Monate.
*   Entwickle eine Möglichkeit, zukünftige Einträge vorauszusagen.
*   Prozentuale Budgetgrenzen für Kategorien festlegen.
*   Dynamische Anpassung der Budgetgrenzen basierend auf vergangenen Ausgaben.
*   Schuldenverwaltung (Gläubiger, Betrag, Fälligkeit, Zinsen, etc.).
*   Debitoren- und Kreditorenmanagement.

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!