import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int accountNumber;
    private String surname;

    public Employee(String name, String surname, int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 456),
                new Employee(null, "Smith", 456),
                new Employee("Doe", "John", 123),
                new Employee("Doe", "John", 123),
                new Employee("Doe", "Smith", 123),
                new Employee("John", "Smith", 456)
        );

        /*Set<Employee> uniqueEmployees = employees.stream()
                .map(employee -> {
                    if (employee.getName() == null) {
                        return setDefaultName(employee);
                    }
                    return employee;
                })
                .filter(employee -> !employee.getName().equals("DefaultName")) // Filter out employees with default name
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(
                                emp -> emp.getAccountNumber() + "-" + emp.getName(),
                                Collectors.mapping(emp -> emp, Collectors.toSet())
                        ),
                        map -> map.values().stream()
                                .flatMap(Set::stream)
                                .collect(Collectors.toSet())
                ));*/

        List<Employee> uniqueEmployees = employees.stream()
                .map(employee -> {
                    if (employee.getName() == null) {
                        return setDefaultName(employee);
                    }
                    return employee;
                })
                .filter(employee -> !employee.getName().equals("DefaultName"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(
                                emp -> emp.getAccountNumber() + "-" + emp.getName()+"-"+emp.getSurname(),
                                emp -> emp,
                                (existing, replacement) -> existing),
                        map -> new ArrayList<>(map.values())));

        System.out.println(uniqueEmployees);
    }

    private static Employee setDefaultName(Employee employee) {
        String defaultName = "DefaultName";
        employee.setName(defaultName);
        return employee;
    }
}
