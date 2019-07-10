package decorator;

public abstract class SmartTelevisionDecorator implements Television {
    protected Television television;

    public SmartTelevisionDecorator(Television television) {
        this.television = television;
    }

    @Override
    public void turnOn() {
        television.turnOn();
    }

    @Override
    public void turnOff() {
        television.turnOff();
    }

    public void connectInternet(){
        System.out.println("Television connected internet");
    }
}
