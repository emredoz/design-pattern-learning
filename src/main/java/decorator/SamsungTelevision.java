package decorator;

public class SamsungTelevision implements Television {
    @Override
    public void turnOn() {
        System.out.println("Television is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is off");
    }
}
