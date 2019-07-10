package decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Television tv = new SamsungTelevision();
        tv.turnOn();
        tv.turnOff();

        SmartTelevisionDecorator smartTelevision = new SamsungSmartTelevision(tv);
        smartTelevision.turnOn();
        smartTelevision.connectInternet();
        smartTelevision.turnOff();
    }
}
