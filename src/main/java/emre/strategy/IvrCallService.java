package emre.strategy;

public class IvrCallService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        System.out.println("Called to : " + customer);
    }
}
