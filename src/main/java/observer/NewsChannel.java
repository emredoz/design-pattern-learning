package observer;

public interface NewsChannel {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifier(String message);
}
