import java.util.Random;

public class TopManager implements Employee {

    Random rand = new Random();
    private final Company company;
    private final double fixedSalary = 250000;
    private static final double BONUS_BORDER = 10_000_000;
    private final double incomeForCompany = rand.nextInt(260000, 280000);

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

    @Override
    public double getIncomeForCompany() {
        return incomeForCompany;
    }
}