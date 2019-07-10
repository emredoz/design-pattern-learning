package composite;

public class Developer extends Employee implements EmployeeProcess {

    public Developer(String name, String surname, Long salary) {
        super(name, surname, salary);
    }

    @Override
    public void runProject() {
        System.out.println("Developer: " + getName() + " is Running turnOn Project");
    }
}
