package tr.com.mertcetkay.samples.problems;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 *
 * Created by Mert on 8.4.2015.
 */
public class CharArrayReaderProblem {

    /**
     * ?? What is the output of the program ??
     */
    public static void testCharArrayReader (){
        String str = "abcdefgh";
        char c[] = new char[str.length()];
        str.getChars(0,str.length(),c,0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c,1,4);
        int i,j;

        try{
            for( int k = 0; k < 8; k++){
                System.out.println( (char)input2.read());
            }
            while( (i=input1.read()) == (j=input2.read()) ){
                System.out.println((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testCharArrayReader();
    }
}
