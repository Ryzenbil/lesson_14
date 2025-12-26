import java.util.Random;

public class Operator implements Employee{
    Random rand = new Random();

    private final double fixedSalary = 80000;
    private final double incomeForCompany = rand.nextInt(80000, 100000);

    @Override
    public double getMonthSalary() {
        return fixedSalary;
    }

    @Override
    public double getIncomeForCompany() {
        return incomeForCompany;
    }
}