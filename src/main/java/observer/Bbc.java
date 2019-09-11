package observer;

import java.util.ArrayList;
import java.util.List;

public class Bbc implements NewsChannel {

    private static Bbc instance = null;
    private List<Subscriber> subscriberList = new ArrayList<>();

    private Bbc() {
    }

    public static Bbc getInstance() {
        if (instance == null) {
            if (instance == null) {
                instance = new Bbc();
            }
        }
        return instance;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifier(String message) {
        subscriberList.forEach(s -> s.update(message));
    }
}
