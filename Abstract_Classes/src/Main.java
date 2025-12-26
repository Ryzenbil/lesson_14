import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++ ){
            Operator operator = new Operator();
            employees.add(operator);
        }
        company.hireAll(employees);

        for (int i = 0; i < 80; i++ ){
            Manager manager = new Manager();
            company.hire(manager);
        }

        for (int i = 0; i < 10; i++ ){
            TopManager teamLead = new TopManager(company);
            company.hire(teamLead);
        }
        company.getTopSalaryStaff(15);
        company.getLowestSalaryStaff(50);
        System.out.println(company.employeesList.size());

        int half = company.employeesList.size() / 2;

        for (int i = 0; i < half; i++) {
            company.fire(company.employeesList.getFirst());
        }

        System.out.println(company.employeesList.size());


        company.getTopSalaryStaff(15);
        company.getLowestSalaryStaff(50);
    }
}