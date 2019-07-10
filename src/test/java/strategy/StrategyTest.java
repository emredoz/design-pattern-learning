package strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void test(){
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
