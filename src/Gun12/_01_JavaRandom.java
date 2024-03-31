package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayı üretir. 0 - 0,999999999 arası üretiyor.
        // System.out.println(Math.random());

        // 0-10 arası bir random tam sayı istiyorum

        int rndSayi = (int) (Math.random() * 25);
        System.out.println("rndSayi = " + rndSayi);

    }
}

//        0 - 0,9999999999
//
//        10 a kadar -> 9 max
//        100 e kadar -> 99 max
//        25 e kadar -> 24 max