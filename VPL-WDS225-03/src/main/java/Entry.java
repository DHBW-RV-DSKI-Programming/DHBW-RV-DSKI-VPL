import java.math.BigDecimal;
import java.time.LocalDate;

record Entry(LocalDate date, String category, BigDecimal amount, String description) {

    // Why to use BigDecimal instead of double?
    // --> https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/math/BigDecimal.html
    // --> https://www.baeldung.com/java-double-vs-bigdecimal

}
