import java.util.Random;

public class Operator implements Employee{
    private final double fixedSalary = 80000;

    @Override
    public double getMonthSalary() {
        return fixedSalary;
    }
}