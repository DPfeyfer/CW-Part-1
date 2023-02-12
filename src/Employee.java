import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String secondName;
    private int department;
    private double salary;
    //    private int id = 0;  why does not work??
    private int id;
    private static int counter;


    public Employee(String firstName, String secondName, int department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
//        this.id += 1;  ???
        this.id = ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                ", Second name: " + secondName +
                ", Department: " + department +
                ", Salary is " + salary + " $ " + "by month" +
                ", ID " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}
