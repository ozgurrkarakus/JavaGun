package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

        //  10/3 ->  3.333333    beklenen durum
        // bilgisayarın yaptığına gelelim
        //  int/int -> tam sayı kısmını verir  yani 10/3   -> 3

        //  küsüratlı sonuç istiyorsan en birisi double olmalı ki, bilgisayar kusuratlı
        //  sonuç versin.
        //  double/int veya int/double veya double/double olmalı -> 3.33333

        int sayi1=10;
        int sayi2=3;

        int tamSonuc = sayi1 / sayi2;  // int/int
        System.out.println("tamSonuc = " + tamSonuc); // 3

        // eğer küsüratlı sonuç istiyorsan
        double doubleSonuc= sayi1/(double)sayi2;
        System.out.println("doubleSonuc = " + doubleSonuc); // 3.33333

    }
}
