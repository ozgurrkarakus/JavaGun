package Gun23;

import java.util.HashSet;

public class _08_Soru {
    public static void main(String[] args) {
        // 1 de 20 ye kadar (20 dahil) olan sayılardan random olarak
        // tekrar olmayacak şekilde 10 tane sini bir diziye atayınız
        // yani 10 tane random sayı istiyoruz ama içinde tekrar
        // olmayacak

        HashSet<Integer> sayilar= new HashSet<>();

        while( sayilar.size() < 10){ //10 olduğunda duracak

            int rndSayi=(int)(Math.random()*20)+1;

            sayilar.add(rndSayi);

        }

        System.out.println("sayilar = " + sayilar);
    }
}
