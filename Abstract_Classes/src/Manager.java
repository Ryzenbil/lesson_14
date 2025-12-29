import java.util.Random;

public class Manager implements Employee{
    private final double fixedSalary = 100000;
    private final double incomeForCompany;

    public Manager(){
        Random rand = new Random();
        incomeForCompany = rand.nextInt(115000, 140000);
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary + incomeForCompany * 0.05;
    }

    public double getIncomeForCompany() {
        return incomeForCompany;
    }
}