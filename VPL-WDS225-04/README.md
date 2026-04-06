# Tic-Tac-Toe

## Ziel der Aufgabe

Programmiere ein **Tic-Tac-Toe-Spiel**, das im Terminal läuft. Zwei Spieler sollen abwechselnd ihre Züge eingeben können, und das Programm soll das Spielfeld entsprechend aktualisieren. Das Spiel endet, wenn ein Spieler gewinnt oder das Spielfeld voll ist.

- - -

## Anforderungen

### Spielfeld-Darstellung:

*   Das Spielfeld soll als **3×3-Gitter** im Terminal ausgegeben werden.
*   Leere Felder sollen durch eine Zahl (**1 – 9**) dargestellt werden, um die Eingabe für die Spieler zu erleichtern.

### Spielablauf:

1.  Zwei Spieler spielen abwechselnd.
2.  Der Spieler gibt die Nummer des Feldes ein, auf das er seinen Zug setzen möchte.
3.  Das Spielfeld wird nach jedem Zug aktualisiert und erneut angezeigt.
4.  Falls ein Spieler ein ungültiges Feld wählt (z. B. ein bereits belegtes Feld oder eine ungültige Zahl), muss er eine neue Eingabe tätigen.

### Spielende:

*   Das Spiel erkennt, wenn ein Spieler drei Zeichen in einer Reihe, Spalte oder Diagonale gesetzt hat, und gibt eine entsprechende Gewinnmeldung aus.
*   Falls alle Felder belegt sind, ohne dass ein Spieler gewinnt, soll das Programm ein Unentschieden anzeigen.

- - -

## Erwartete Ein- und Ausgabe (Beispiel)

### Start:

```
 1 | 2 | 3
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9
```

### Spielablauf:

```
Spieler X, wähle ein Feld (1-9): 5

 1 | 2 | 3
---+---+---
 4 | X | 6
---+---+---
 7 | 8 | 9
```

### Spielende:

```
Spieler X gewinnt!  
```

oder

```
Unentschieden!  
```

## Abgabe

Reiche alle Dateien als `Zip` ein. Viel Erfolg!