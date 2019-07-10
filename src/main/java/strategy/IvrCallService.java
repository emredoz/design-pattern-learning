package strategy;

public class IvrCallService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        call(customer);
    }

    private void call(Customer customer) {
        System.out.println("Called to : " + customer);
    }
}
