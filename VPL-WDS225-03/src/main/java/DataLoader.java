import java.math.BigDecimal;
import java.time.LocalDate;

class DataLoader {

    private final static Entry[] entries = new Entry[]{
        new Entry(LocalDate.of(2025, 1, 1), "Lebensmittel", new BigDecimal("-50.00"), "Wochenende"),
        new Entry(LocalDate.of(2025, 1, 2), "Lebensmittel", new BigDecimal("-20.00"), "Frühstück"),
        new Entry(LocalDate.of(2025, 1, 3), "Lebensmittel", new BigDecimal("-30.00"), "Mittagessen"),
        new Entry(LocalDate.of(2025, 1, 4), "Lebensmittel", new BigDecimal("-40.00"), "Abendessen"),
        new Entry(LocalDate.of(2025, 1, 4), "Miete", new BigDecimal("-500.00"), "Januar"),
        new Entry(LocalDate.of(2025, 1, 5), "Gehalt", new BigDecimal("2000.00"), "Januar"),
        new Entry(LocalDate.of(2025, 2, 1), "Lebensmittel", new BigDecimal("-50.00"), "Wochenende"),
    };

    static Entry[] loadEntries() {
        return entries;
    }

}
