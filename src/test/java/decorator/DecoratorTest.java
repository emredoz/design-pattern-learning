package decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Television tv = new SamsungTelevision();
        tv.turnOn();
        tv.turnOff();

        SmartTelevisionDecorator smartTelevision = new SamsungSmartTelevision(tv);
        smartTelevision.turnOn();
        smartTelevision.connectInternet();
        smartTelevision.turnOff();
    }
}
