import java.util.Random;

public class Manager implements Employee{
    Random rand = new Random();

    private final double fixedSalary = 100000;
    private final double incomeForCompany = rand.nextInt(115000, 140000);
    double totalSalary = fixedSalary + incomeForCompany * 0.05;

    @Override
    public double getMonthSalary() {
        return totalSalary;
    }

    @Override
    public double getIncomeForCompany() {
        return incomeForCompany;
    }
}