package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700;   // 2,5 mil
        byte sayi=5;       // 127

        sayi=(byte)toplam;  // Veri kaybı olmasa bile dikkatli olunmalı
        System.out.println("sayi = " + sayi); // veri kaybı var

        double oran=3.7; // tam sayı kısmını almak için kullanılan bi yöntemdir aynı zamanda
        toplam = (int)oran; // double -> int
        System.out.println("toplam = " + toplam);
        // veri kaybı var, ondalık kısım kayboldu
    }
}
