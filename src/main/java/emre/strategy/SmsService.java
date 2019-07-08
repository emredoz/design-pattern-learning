package emre.strategy;

public class SmsService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        System.out.println("Sent sms to: " + customer);
    }
}
