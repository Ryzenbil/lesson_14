import java.util.Random;

public class TopManager implements Employee {
    private final Company company;
    private final double fixedSalary = 250000;
    private static final double BONUS_BORDER = 10_000_000;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > BONUS_BORDER) {
            return fixedSalary * 2.5;
        } else {
            return fixedSalary;
        }
    }
}