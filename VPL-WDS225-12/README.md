# Springerproblem (Knight's Tour)

## Ziel der Aufgabe

Implementiere eine Java-Anwendung, die das Springerproblem (auch bekannt als Knight's Tour) löst. Das Ziel ist es, einen Springer auf einem Schachbrett so zu bewegen, dass er jedes Feld genau einmal besucht.

## Aufgabenstellung

### 1. Implementierung des Schachbretts

- Erstelle eine Klasse `Chessboard`, die ein 8x8-Schachbrett repräsentiert.
- Jedes Feld des Schachbretts kann durch eine Koordinate (z. B. `(x, y)`) dargestellt werden.

### 2. Mögliche Züge des Springers

- Implementiere eine Methode, die alle möglichen Züge des Springers von einer gegebenen Position aus berechnet. Beachte, dass bis zu 8 unterschiedliche Züge möglich sind – siehe dazu das Bild unten.
- Stelle sicher, dass der Springer nicht außerhalb des Schachbretts bewegt wird.

Springer-Züge

### 3. Darstellung der Lösung

- Gib die gefundene Tour auf der Konsole aus, z. B. als Liste der besuchten Felder.
- <u>Optional:</u> Visualisiere das Schachbrett mit der Tour in der Konsole.

## Erwartete Ausgabe (Beispiel)

```
Gefundene Tour:
(0, 0) -> (2, 1) -> (0, 2) -> (1, 4) -> (3, 5) -> (1, 6) -> (2, 4) -> (4, 5) -> ...
Gesamtzahl der Züge: 64
```

## Optionale Erweiterungen

- Implementiere eine Funktion, die alle möglichen Touren findet.
- Erweitere das Programm, um Touren auf Schachbrettern unterschiedlicher Größe (z. B. 6x6 oder 10x10) zu finden.