package composite;

public interface EmployeeProcess {

    default void add(Employee e) throws OperationNotSupported {
        throw new OperationNotSupported();
    }

    default void remove(Employee e) throws OperationNotSupported {
        throw new OperationNotSupported();
    }

    default void assignProject(String projectDescription, Employee employee) throws OperationNotSupported {
        throw new OperationNotSupported();
    }

    default void runProject() throws OperationNotSupported {
        throw new OperationNotSupported();
    }
}
