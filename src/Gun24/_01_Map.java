package Gun24;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap

        // Map =  Anahtar + Set -> Anahtarlı set
        // Anahtar + Değer -> Key + Value

        // anhtarın ve valuenin tipini biz vereceğiz,
        HashMap<Integer, String>  hm=new HashMap<>();
        hm.put(1001, "İsmet Temur");
        hm.put(2001, "Esma");
        hm.put(2,    "Oğuzhan");
        hm.put(1003, "Kaan");
        hm.put(1001, "Ahmet Kaya");// aynısı olamayacağı için
        // eskisini değiştirdi. setleme yani güncelledi

        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(1003) = " + hm.get(1003));

        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));
        System.out.println("hm.containsValue(Kaan) = " + hm.containsValue("Kaan"));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(1001);
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
