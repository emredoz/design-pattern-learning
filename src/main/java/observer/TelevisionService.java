package observer;

public class TelevisionService implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("Television Service: " + message);
    }
}
