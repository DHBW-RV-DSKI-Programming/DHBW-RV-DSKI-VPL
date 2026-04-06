# Büchereiverwaltung

## Anforderungen

1. Erstelle eine Klasse `Book` mit folgenden Attributen:
    - `isbn` (String): Die ISBN-Nummer des Buches
    - `title` (String): Der Titel des Buches
    - `author` (String): Der Autor des Buches
    - `publicationYear` (int): Das Erscheinungsjahr
    - `pageCount` (int): Die Anzahl der Seiten
    - `rating` (double): Eine Bewertung von 0.0 bis 5.0

2. Implementiere das `Comparable`-Interface für die Klasse `Book`:
    - Die natürliche Ordnung soll Bücher nach ihrem Titel alphabetisch sortieren.

3. Erstelle eine Klasse `Library`, die eine Liste von Büchern verwaltet und folgende Funktionen bietet:
    - `addBook(Book book)`: Fügt ein Buch zur Sammlung hinzu
    - `displayBooks()`: Gibt alle Bücher in der aktuellen Sortierung aus
    - `sortByTitle()`: Sortiert die Bücher nach Titel (nutzt die natürliche Ordnung)
    - `sortByAuthor()`: Sortiert die Bücher nach Autor (benötigt einen Comparator)
    - `sortByPublicationYear()`: Sortiert die Bücher nach Erscheinungsjahr (benötigt einen Comparator)
    - `sortByRating(boolean descending)`: Sortiert die Bücher nach Bewertung, wahlweise auf- oder absteigend (benötigt einen Comparator)
    - `sortByAuthorYearAndPages()`: Sortiert die Bücher nach Autor, bei gleichem Autor nach Erscheinungsjahr und bei gleichem Erscheinungsjahr nach Seitenzahl (benötigt einen komplexen Comparator)

4. Implementiere für jede Sortiermethode (außer `sortByTitle`) einen passenden `Comparator`:
    - `AuthorComparator`: Vergleicht Bücher nach Autorennamen
    - `PublicationYearComparator`: Vergleicht Bücher nach Erscheinungsjahr
    - `RatingComparator`: Vergleicht Bücher nach Bewertung, kann auf- oder absteigend sortieren
    - `AuthorYearPagesComparator`: Ein komplexer Comparator, der drei Kriterien in einer bestimmten Reihenfolge anwendet (Autor → Erscheinungsjahr → Seitenzahl)

5. Schreibe eine `Main`-Klasse mit einer `main`-Methode, die:
    - Mehrere Book-Objekte erstellt und einer `Library`-Instanz hinzufügt
    - Alle Sortiermethoden demonstriert und die Ergebnisse ausgibt