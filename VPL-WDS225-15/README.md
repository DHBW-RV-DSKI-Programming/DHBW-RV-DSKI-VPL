# Verzeichnis-Analyse-Tool

## Beschreibung
In dieser Aufgabe wirst du einen einfachen Datei-Explorer in Java entwickeln.
Das Programm soll ein Verzeichnis analysieren und verschiedene Statistiken über die enthaltenen Dateien sammeln und anzeigen.
Diese Aufgabe lehrt dir den Umgang mit Dateisystemen, Rekursion und die Verarbeitung von Dateimetadaten.

## Anforderungen

1. Schreibe ein Programm, das den Benutzer nach einem Verzeichnispfad fragt.
2. Das Programm soll prüfen, ob das angegebene Verzeichnis existiert.
3. Falls das Verzeichnis existiert, soll das Programm folgende Informationen sammeln und anzeigen:
    - Gesamtzahl der Dateien im Verzeichnis (inklusive Unterverzeichnisse)
    - Gesamtzahl der Unterverzeichnisse
    - Größte Datei (Name und Größe in KB)
    - Kleinste Datei (Name und Größe in KB)
    - Durchschnittliche Dateigröße (in KB)
    - Anzahl der Dateien pro Dateityp (basierend auf Dateiendung)
    - Die 5 neuesten Dateien (mit Datum der letzten Änderung)
4. Der Benutzer soll die Möglichkeit haben, nach Dateien zu suchen, die einen bestimmten Begriff im Namen enthalten.
5. Das Ergebnis der Analyse soll sowohl auf der Konsole angezeigt, als auch in einer Protokolldatei "analysis_result.txt" im aktuellen Arbeitsverzeichnis geschrieben werden.

Achte auf ein sinnvolles Exception-Handling und passende Datentypen!