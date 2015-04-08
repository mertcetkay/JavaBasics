package tr.com.mertcetkay.domain;

/**
 * Created by Mert on 8.4.2015.
 */
public class TestClass {
    public int a;
    public int b;

    public TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void meth(TestClass o){
        o.a *= 2;
        o.b /= 2;
    }
}
