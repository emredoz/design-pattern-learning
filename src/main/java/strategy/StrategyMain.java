package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        // creating objects
        Customer customer = new Customer();
        Notify emailService = new EmailService();
        Notify ivrCallService = new IvrCallService();
        Notify smsService = new SmsService();

        // Using strategy by clients
        emailService.sendMessage(customer);
        ivrCallService.sendMessage(customer);
        smsService.sendMessage(customer);
    }
}
