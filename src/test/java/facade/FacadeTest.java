package facade;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
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
