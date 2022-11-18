package dailyproblems01;

import java.util.*;

public class SinifRunner {

    // siniftaki ogrenci listesini duzenli olarak yazdiralim
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = SinifListesi.Map1();

        /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */
        Set<Integer> sinifKeySet = sinifListMap.keySet();

        List<Integer> sinifList = new ArrayList<>();
        sinifList.addAll(sinifKeySet);


        //values
        Collection<String> sinifValueSet = sinifListMap.values();
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueSet);
        System.out.println(sinifValueList);

        //Alinan value'lari MultiDimensionalArray'a atacagiz bize index lazim
        int outerArrayBoyut = sinifList.size();

        String ilkValue = sinifValueList.get(0);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;


        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }

        }
        System.out.println(Arrays.deepToString(valueMDArr));

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i <sinifList.size() ; i++) {
            System.out.print( sinifList.get(i)+ "   ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }

            System.out.println("");
        }

    }

}
