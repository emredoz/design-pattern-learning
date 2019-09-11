package observer;


import org.junit.Test;

public class ObserverTest {

    @Test
    public void test(){
        //object create
        NewsChannel bbc = Bbc.getInstance();
        Subscriber subscriber1 = new TelevisionService();
        Subscriber subscriber2 = new RadioService();
        // add subscribe
        bbc.addSubscriber(subscriber1);
        bbc.addSubscriber(subscriber2);

        // clients using
        bbc.notifier("news 1");
        bbc.notifier("news 2");
    }
}
