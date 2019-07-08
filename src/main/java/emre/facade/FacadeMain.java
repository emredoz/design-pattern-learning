package emre.facade;

public class FacadeMain {

    public static void main(String[] args) {
        // creting objects
        AccountOperations ac = new AccountOperations();
        CustomerOperations cu = new CustomerOperations();
        InterestOperations in = new InterestOperations();
        Operations operations = new OperationsImpl(ac, cu, in);
        // using facade by clients
        System.out.println(operations.getAmaount());
        System.out.println(operations.getCustomerInformation());
        System.out.println(operations.getMonthlyInterest());
    }
}
