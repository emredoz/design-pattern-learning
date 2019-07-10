package composite;

public class VicePresident extends Employee implements EmployeeProcess {

    public VicePresident(String name, String surname, Long salary) {
        super(name, surname, salary);
    }

    @Override
    public void add(Employee e) {
        System.out.println("Vice President added:" + e);
    }

    @Override
    public void remove(Employee e) {
        System.out.println("Vice President removed:" + e);
    }

    @Override
    public void assignProject(String projectDescription, Employee employee) {
        System.out.println("Vice President assign " + projectDescription + " project " + " turnOn :" + employee);
    }
}
