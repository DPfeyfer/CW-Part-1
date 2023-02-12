public class Main {
    private static final int EMPLOYEE_AMOUNT = 10;

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_AMOUNT];
        employees[0] = new Employee("Arnold", "Schwarzenegger", 1, 100_000);
        employees[1] = new Employee("Sylvester", "Stallone", 3, 105_000);
        employees[2] = new Employee("Jason", "Statham", 5, 107_000);
        employees[3] = new Employee("Jean-Claude", "Van Damme", 4, 110_000);
        employees[4] = new Employee("Chuck", "Norris", 2, 150_000);
        employees[5] = new Employee("Bruce", "Willis", 1, 108_000);
        employees[6] = new Employee("Guy", "Ritchie", 3, 104_000);
        employees[7] = new Employee("Vinnie", "Jones", 1, 115_000);
        employees[8] = new Employee("Nick", "Moran", 4, 130_000);
        employees[9] = new Employee("Till", "Lindemann", 3, 133_000);

        printEmployee(employees);
        System.out.println();
        System.out.println("Total monthly salary is " + getSumSalary(employees) + " $");

    }

    private static void printEmployee(Employee[] employees) {
        for (Employee actor : employees) {
            System.out.println(actor);
        }
    }

    private static double getSumSalary(Employee[] employees) {
        double salary = 0;
        for (Employee salarySum : employees) {
            salary += salarySum.getSalary();
        }
        return salary;
    }
}
