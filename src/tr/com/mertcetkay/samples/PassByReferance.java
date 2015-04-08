package tr.com.mertcetkay.samples;

import tr.com.mertcetkay.domain.TestClass;

/**
 * Created by Mert on 8.4.2015.
 */
public class PassByReferance {

    /**
     * What is the output of the program
     * Question 6
     */
    public static void testPassByReferance(){
        TestClass obj = new TestClass(10,20);
        obj.meth(obj);
        System.out.println(obj.a + " " + obj.b);
    }

    public static void main(String[] args) {
        testPassByReferance();
    }

    /**
     *  public class TestClass {
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
     */
}
