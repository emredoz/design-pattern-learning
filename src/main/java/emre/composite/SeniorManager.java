package emre.composite;

public class SeniorManager extends Employee implements EmployeeProcess {

    public SeniorManager(String name, String surname, Long salary) {
        super(name, surname, salary);
    }

    @Override
    public void add(Employee e) {
        System.out.println("SeniorManager added:" + e);
    }

    @Override
    public void remove(Employee e) {
        System.out.println("SeniorManager removed:" + e);
    }
}
