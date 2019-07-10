package adapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void test() {
        Movable mercedes = new Mercedes();
        // Using adapter by clients
        MovableAdapter adaptor = new MovableAdapterImpl(mercedes);
        System.out.println(adaptor.getSpeed());
    }
}
