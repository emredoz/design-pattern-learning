package emre.strategy;

public class EmailService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        System.out.println("Sent email to: " + customer);
    }
}
