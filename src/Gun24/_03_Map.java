package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {
        // HashMap : hızlı çalışmak için , kendi algoritmasına göre sırada saklar
        // LinkedHashMap : eklendiği sıraya göre içindeki elemanları saklar
        // TreeMap : içideki elemanları herzaman KEY e göre sıralı saklar

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");

        System.out.println("hm = " + hm);

        LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");

        System.out.println("lhm = " + lhm);

        TreeMap<Integer, String> tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");

        System.out.println("tm = " + tm);




    }
}
