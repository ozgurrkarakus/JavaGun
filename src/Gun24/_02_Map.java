package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yılmaz");
        hm.put(2001, "Talip Yıldız");
        hm.put(5001, "Eyüpcan Bilgin");
        hm.put(1002, "Hatice Bayrak"); // 1002 güncelleniyor

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        System.out.println();

        for(Integer  k: hm.keySet())
            System.out.println("k = " + k);

        System.out.println();

        for(String  v: hm.values())
            System.out.println("v = " + v);

        System.out.println();

        for(Map.Entry<Integer,String> kv : hm.entrySet())
            System.out.println(kv.getKey()+"-"+kv.getValue());




    }
}
