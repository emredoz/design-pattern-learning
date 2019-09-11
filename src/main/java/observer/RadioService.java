package observer;

public class RadioService implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println("RadioService :" + message);
    }
}
