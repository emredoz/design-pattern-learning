package adapter;

import org.junit.Before;
import org.junit.Test;

public class AdapterTest {

    private Movable mercedes;

    @Before
    public void before(){
        mercedes = new Mercedes();
    }

    @Test
    public void test() {
        // Using adapter by clients
        MovableAdapter adaptor = new MovableAdapterImpl(mercedes);
        System.out.println(adaptor.getSpeed());
    }
}
