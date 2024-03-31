package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {
        // SETS : TEKRAR YOK
        // HashSet : HIZLI, bunun için içidekileri kendi mantığına sıralar
        // LinkedHashSet : EKLENME SIRASI na göre sıralı tutar
        // TreeSet : HERZAMAN SIRALI, kendinden sortlu

        // Hızlı, bunun için kendine bör algoritmayla sıralı tutuyor
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // Ekleme SIRASI na göre dısralı tutar
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        // Kendin sortlu
        TreeSet<String> ts = new TreeSet<>();
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        ts.add("bir");
        ts.add("iki");
        System.out.println("ts = " + ts);


    }
}
