package tr.com.mertcetkay.samples;

/**
 * Created by Mert on 8.4.2015.
 */
public class JavaOperators {

    /**
     * ?? What is the output of the program ??
     */
    public static void testOperators(){
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        // System.out.println(c);
        d = a++;

        c++;
        b++;
        ++a;

        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        testOperators();
    }

}
