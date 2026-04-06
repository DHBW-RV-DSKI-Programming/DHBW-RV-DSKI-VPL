import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

class BudgetTracker {

    private final ArrayList<Entry> entries = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    void run() {
        // Add some initial entries
        this.entries.addAll(Arrays.asList(DataLoader.loadEntries()));

        while (true) {
            System.out.println("\nWillkommen beim Budget-Tracker!");
            System.out.println("-----------------------------");
            System.out.println("1. Einnahme/Ausgabe erfassen");
            System.out.println("2. Monatsbericht anzeigen");
            System.out.println("3. Programm beenden");
            System.out.print("Bitte wähle eine Option (1-3): ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addEntry();
                    break;
                case "2":
                    showMonthlyReport();
                    break;
                case "3":
                    System.out.println("Programm beendet.");
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wähle 1, 2 oder 3.");
            }
        }
    }

    private void addEntry() {
        System.out.print("\nGib das Datum ein (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();
        if (isDateInputInvalid(dateInput, 10)) {
            System.out.println("Ungültiges Format. Bitte gib das Datum im Format YYYY-MM-DD ein.");
            return;
        }
        LocalDate date = LocalDate.parse(dateInput);

        System.out.print("Gib die Kategorie ein (Lebensmittel, Miete, Gehalt...): ");
        String category = scanner.nextLine();

        System.out.print("Gib den Betrag ein (positiv für Einnahmen, negativ für Ausgaben): ");
        String amountInput = scanner.nextLine();
        if (isNumberInputInvalid(amountInput)) {
            System.out.println("Ungültige Eingabe. Bitte gib eine Zahl ein.");
            return;
        }
        BigDecimal amount = new BigDecimal(amountInput);

        System.out.print("Beschreibung (optional): ");
        String description = scanner.nextLine();

        this.entries.add(new Entry(date, category, amount, description));
        System.out.println("Eintrag gespeichert!");
    }

    private void showMonthlyReport() {
        System.out.print("Für welches Jahr und Monat (YYYY-MM)?: ");
        String dateInput = scanner.nextLine();

        if (isDateInputInvalid(dateInput, 7)) {
            System.out.println("Ungültiges Format. Bitte gib das Datum im Format YYYY-MM ein.");
            return;
        }

        int year = Integer.parseInt(dateInput.split("-")[0]);
        int month = Integer.parseInt(dateInput.split("-")[1]);

        BigDecimal totalIncome = BigDecimal.ZERO;
        BigDecimal totalExpenses = BigDecimal.ZERO;
        ArrayList<CategorySum> categorySums = new ArrayList<>();

        for (Entry e : entries) {
            if (e.date().getYear() == year && e.date().getMonthValue() == month) {
                String category = e.category();
                BigDecimal amount = e.amount();
                findAndAddCategorySum(categorySums, category, amount);
                if (amount.compareTo(BigDecimal.ZERO) >= 0) {
                    totalIncome = totalIncome.add(amount);
                } else {
                    totalExpenses = totalExpenses.add(amount);
                }
            }
        }

        System.out.println("\nMonatsbericht für " + dateInput + ":");
        System.out.println("Gesamteinnahmen: " + totalIncome + " €");
        System.out.println("Gesamtausgaben: " + totalExpenses + " €");
        System.out.println("Saldo: " + totalIncome.add(totalExpenses) + " €\n");

        System.out.println("Ausgaben nach Kategorie:");
        for (CategorySum cs : categorySums) {
            System.out.println("- " + cs.getCategoryName() + ": " + cs.getCategorySum() + " €");
        }
    }

    private void findAndAddCategorySum(ArrayList<CategorySum> categorySums, String category, BigDecimal amount) {
        for (CategorySum cs : categorySums) {
            if (cs.getCategoryName().equals(category)) {
                cs.combineCategorySum(amount);
                return;
            }
        }
        categorySums.add(new CategorySum(category, amount));
    }

    private boolean isDateInputInvalid(String input, int allowedLength) {
        if (input.length() != allowedLength || !input.contains("-")) {
            return true;
        }
        return false;
    }

    private boolean isNumberInputInvalid(String input) {
        for (char c : input.toCharArray()) {
            // How to check german ',' ? --> https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/text/NumberFormat.html
            if (c != '.' && c != '+' && c != '-' && !Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}