package strategy;

public class SmsService implements Notify {
    @Override
    public void sendMessage(Customer customer) {
        sendSms(customer);
    }

    private void sendSms(Customer customer) {
        System.out.println("Sent sms to: " + customer);
    }
}
