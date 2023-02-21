public class Main {
    private static final int EMPLOYEE_AMOUNT = 10;
    private static Employee[] employees = new Employee[EMPLOYEE_AMOUNT];

    public static void main(String[] args) {
        employees[0] = new Employee("Arnold", "Schwarzenegger", 1, 134_000);
        employees[1] = new Employee("Sylvester", "Stallone", 3, 125_000);
        employees[2] = new Employee("Jason", "Statham", 5, 126_000);
        employees[3] = new Employee("Jean-Claude", "Van Damme", 4, 117_000);
        employees[4] = new Employee("Chuck", "Norris", 2, 147_000);
        employees[5] = new Employee("Bruce", "Willis", 1, 152_000);
        employees[6] = new Employee("Guy", "Ritchie", 3, 128_000);
        employees[7] = new Employee("Vinnie", "Jones", 1, 116_000);
        employees[8] = new Employee("Nick", "Moran", 4, 131_000);
        employees[9] = new Employee("Till", "Lindemann", 3, 135_000);

        printEmployee(employees);
        System.out.println();
        System.out.println("Total monthly salary is " + getSumSalary(employees) + " $");
        System.out.println();
        System.out.println("Max salary is " + findMaxSalary(employees) + " $");
        System.out.println();
        System.out.println("Actor with max salary \n" + actorMaxSalary(employees));
        System.out.println();
        System.out.println("Actor with min salary \n" + actorMinSalary(employees));
        System.out.println();
        System.out.println("Average salary of actors is " + actorAverageSalary(employees));
        System.out.println();
        printActorFullName(employees);
        System.out.println();
        System.out.println(indexSalary(employees, 2));
        printEmployee(employees);
    }


    private static void printEmployee(Employee[] employees) {
        for (Employee actor : employees) {
            System.out.println(actor);
        }
    }

    private static double getSumSalary(Employee[] employees) {
        double salary = 0;
        for (Employee salarySum : employees) {
            salary += Employee.getSalary();
        }
        return salary;
    }

    private static double findMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee salary : employees) {
            if (Employee.getSalary() > maxSalary) {
                maxSalary = Employee.getSalary();
            }
        }
        return maxSalary;
    }

    private static Employee actorMaxSalary(Employee[] employees) {
        Employee actorSalary = employees[0];
        for (Employee salary : employees) {
            if (Employee.getSalary() > Employee.getSalary()) {
                actorSalary = salary;
            }
        }
        return actorSalary;
    }

    private static Employee actorMinSalary(Employee[] employees) {
        Employee actorSalary = employees[0];
        for (Employee salary : employees) {
            if (Employee.getSalary() < Employee.getSalary()) {
                actorSalary = salary;
            }
        }
        return actorSalary;
    }

    private static double actorAverageSalary(Employee[] employees) {
        double salarySum = getSumSalary(employees);
        return salarySum / employees.length;
    }

    private static void printActorFullName(Employee[] employees) {
        for (Employee fullName : employees) {
            System.out.println(fullName.getFirstName() + " " + fullName.getSecondName());
        }
    }

    private static double indexSalary(Employee[] employees, int index) {
        double indexSalary = Employee.getSalary();
        for (Employee salary: employees) {
            indexSalary = Employee.getSalary() + (salary.getSalary() * index / 100);

        }
        return indexSalary;
    }
}
