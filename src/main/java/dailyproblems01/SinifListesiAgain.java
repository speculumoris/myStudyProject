package dailyproblems01;

import java.util.*;

public class SinifListesiAgain {
    public static void main(String[] args) {
        HashMap<Integer,String >sinifMap=SinifListesi.Map1();
        System.out.println(sinifMap);

        Set<Integer>sinifKeySet=sinifMap.keySet();
        List<Integer>sinifKeyList=new ArrayList<>();
        sinifKeyList.addAll(sinifKeySet);

        Collection<String> sinifValueSet=sinifMap.values();
        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueSet);

        //MD array'a ekle;
        int outerLength=sinifKeyList.size();

        String ilkvalue =sinifValueList.get(0);
        String ilkValueArr[]=ilkvalue.split(", ");
        int innerSize=ilkValueArr.length;

        String mapValueMD[][] =new String[outerLength][innerSize];

        for (int i = 0; i <outerLength ; i++) {
            String temp[] =sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerSize; j++) {
                mapValueMD[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(mapValueMD));

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i < sinifKeyList.size(); i++) {
            System.out.print(sinifKeyList.get(i)+" ");
            for (int j = 0; j < innerSize; j++) {
                System.out.print(mapValueMD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
