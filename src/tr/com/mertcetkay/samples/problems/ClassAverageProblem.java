package tr.com.mertcetkay.samples.problems;

/**
 * Created by Mert on 8.4.2015.
 */
public class ClassAverageProblem {

    /**
     * Ogrencilerin yuzde kacinin ortalamanin uzerinde oldugunu hesaplar,
     * Bulunan sonucu en yakin tam sayi degere yuvarlar.
     *
     * @param marks Ogrenci notlarini iceren int array
     * @return  tam sayi yuzde degeri
     */
    public static int getAboveAverage(int[] marks)
    {
        double abovePercentage;
        double numOfStudentsAboveAverage = 0;
        double average;

        int totalMark = 0;
        for(int i = 0 ; i < marks.length; i++){
            totalMark += marks[i];
        }

        average = totalMark / marks.length;

        for(int i = 0 ; i < marks.length; i++){
            if(marks[i] > average){
                numOfStudentsAboveAverage++;
            }
        }
        abovePercentage =  Math.round((numOfStudentsAboveAverage/(double)marks.length)*100);
        return (int)abovePercentage;
    }

    public static void main(String...args){
        int[] marks = {20,23,7};

        System.out.println(getAboveAverage(marks));
    }
}
