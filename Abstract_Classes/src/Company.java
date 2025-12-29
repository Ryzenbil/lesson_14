import java.util.*;

public class Company{

    double income = 0;
    ArrayList<Employee> employeesList = new ArrayList<>();

    private List<Integer> getSalaryStaff(int count, Comparator<Integer> comparator) {
        if (count <= 0) {
            System.out.println("Please enter a number greater than 0");
            return new ArrayList<>();
        }

        List<Integer> salaryStaff = new ArrayList<>();

        for (Employee employee : employeesList) {
            salaryStaff.add((int) employee.getMonthSalary());
        }

        salaryStaff.sort(comparator);

        for (int i = 0; i < Math.min(count, salaryStaff.size()); i++) {
            System.out.println(salaryStaff.get(i) + " руб.");
        }
        return salaryStaff.subList(0, Math.min(count, salaryStaff.size()));
    }


    public void getTopSalaryStaff(int count) {
        System.out.println("Top " + count + " Salary Staff:");
        getSalaryStaff(count, Comparator.reverseOrder());
    }

    public void getLowestSalaryStaff(int count) {
        System.out.println("Lowest " + count + " Salary Staff:");
        getSalaryStaff(count, Comparator.naturalOrder());
    }


    public void hire (Employee employee){
        employeesList.add(employee);

        if (employee instanceof Manager) {
            double inc = ((Manager) employee).getIncomeForCompany();
            incomeCount(inc);
        }
    }

    public void hireAll(Collection<Employee> employees) {
        employeesList.addAll(employees);
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                double inc = ((Manager) employee).getIncomeForCompany();
                incomeCount(inc);
            }
        }
    }

    public void fire(Employee employee){
        if(employeesList.contains(employee)){
            employeesList.remove(employee);

            if(employee instanceof Manager){
                double inc = ((Manager) employee).getIncomeForCompany();
                fireIncomeCount(inc);
            }
        } else {
            System.out.println("Employee not found.\n");
        }
    }

    public void fireIncomeCount (double income){
        this.income-=income;
    }

    public void incomeCount (double income){
        this.income+=income;
    }

    public double getIncome() {
        return income;
    }
}