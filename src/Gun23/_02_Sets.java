package Gun23;

import java.util.HashSet;

public class _02_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hs1=new HashSet<>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);

        System.out.println("hs1 = " + hs1);

        //bakalım eklenecek mi
        hs1.add(4); // eklemek istesenizde SET ler tekrar eklemez
        hs1.add(2); // eklemek istesenizde SET ler tekrar eklemez

        System.out.println("hs1 = " + hs1);

    }
}
