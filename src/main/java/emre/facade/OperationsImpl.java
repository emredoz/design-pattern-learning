package emre.facade;

import java.math.BigDecimal;

public class OperationsImpl implements Operations {

    private AccountOperations accountOperations;
    private CustomerOperations customerOperations;
    private InterestOperations interestOperations;

    public OperationsImpl(AccountOperations accountOperations, CustomerOperations customerOperations, InterestOperations interestOperations) {
        this.accountOperations = accountOperations;
        this.customerOperations = customerOperations;
        this.interestOperations = interestOperations;
    }

    @Override
    public BigDecimal getAmaount() {
        return accountOperations.getAmaount();
    }

    @Override
    public String getCustomerInformation() {
        return customerOperations.getCustomerInformation();
    }

    @Override
    public Double getMonthlyInterest() {
        return interestOperations.getMonthlyInterest();
    }
}
