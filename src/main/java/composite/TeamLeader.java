package composite;

public class TeamLeader extends Employee implements EmployeeProcess {

    public TeamLeader(String name, String surname, Long salary) {
        super(name, surname, salary);
    }

    @Override
    public void add(Employee e) {
        System.out.println("Team Leader added:" + e);
    }

    @Override
    public void remove(Employee e) {
        System.out.println("Team Leader removed:" + e);
    }

    @Override
    public void assignProject(String projectDescription, Employee employee) {
        System.out.println("Team Leader assign" + projectDescription + " turnOn :" + employee);
    }

    @Override
    public void runProject() {
        System.out.println("Team Leader: " + getName() + " is Running turnOn Project");
    }
}
