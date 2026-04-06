The Java Dungeon Escape
=======================

Willkommen! Die Aufgabe ist es, ein textbasiertes Adventure in Java zu entwickeln.  
Nutzt eure Kenntnisse über Variablen, Scanner und Kontrollstrukturen, um eine Welt voller Gefahren und Rätsel zu erschaffen.

Die Kernaufgabe
---------------

Erstellt ein Programm, das eine Geschichte erzählt. Der Spieler muss Entscheidungen treffen, die den Verlauf beeinflussen.

*   **Input:** Nutze die `Scanner`\-Klasse für Namen und Entscheidungen.
*   **Status:** Verwalte Lebenspunkte (`int`) und den Besitz von Items (`boolean`).
*   **Verzweigung:** Implementiere eine Vielzahl von Ebenen, Verschachtelungen und Kombinierungen von `if-else` oder `switch-case`.

Hinweise/ Möglichkeiten
-----------------------

*   Verschiedene Schreibweisen abfangen (links, Links, ...)
*   Gier-Prüfung: Beim Fund einer Schatzkiste darf der Spieler wählen, wie viel Gold er nimmt (zu wenig Diebstahl-Versuch; zu viel Spieler wird zu langsam und erwischt)
*   Rätsel: Ein verschlossenes Tor benötigt einen Code, welcher `X`\-Anzahl von Bedingungen hat.
*   Glücksfaktor: Nutze `Math.random()`, um eine Chance für einen kritischen Treffer einzubauen.
*   Cheat-Code: Wenn der Spieler als Name Geralt eingibt, startet er mit 999 Lebenspunkten.

Abgabe
------

Reiche alle Dateien als `Zip` ein. Viel Erfolg!