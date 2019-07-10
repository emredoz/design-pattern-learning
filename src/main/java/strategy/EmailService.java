package strategy;

public class EmailService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        sendEmail(customer);
    }

    private void sendEmail(Customer customer) {
        System.out.println("Sent email to: " + customer);
    }
}
