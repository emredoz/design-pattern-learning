package singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        SingletonImpl_v1 singletonImpl_v1 = SingletonImpl_v1.getRepository();
        SingletonImpl_v2 singletonImpl_v2 = SingletonImpl_v2.getRepository();
        SingletonImpl_v3 singletonImpl_v3 = SingletonImpl_v3.getRepository();
        SingletonImpl_v4 singletonImpl_v4 = SingletonImpl_v4.getRepository();
        SingletonImpl_v5 singletonImpl_v5 = SingletonImpl_v5.getRepository();
    }
}
