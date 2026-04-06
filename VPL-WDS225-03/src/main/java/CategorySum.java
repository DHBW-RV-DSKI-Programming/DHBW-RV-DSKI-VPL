import java.math.BigDecimal;

class CategorySum {

    private final String categoryName;
    private BigDecimal categorySum;

    CategorySum(String categoryName, BigDecimal categorySum) {
        this.categoryName = categoryName;
        this.categorySum = categorySum;
    }

    String getCategoryName() {
        return categoryName;
    }

    void combineCategorySum(BigDecimal amount) {
        this.categorySum = this.categorySum.add(amount);
    }

    BigDecimal getCategorySum() {
        return categorySum;
    }

}
