package tr.com.mertcetkay.samples;

/**
 * Created by Mert on 8.4.2015.
 */
public class StringManipulationByRegEx {

    /**
     * Verilen string icin;
     * 1) bastaki ve sonraki bosluklari kaldirir
     * 2) birden fazla olan butun bosluklari tek bosluk haline getirir.
     */
    public static String CorrectFormatting(String line)
    {
        String result;
        result = line.trim();
        result = result.replaceAll("\\s+", " ");
        return result;
    }
}
