package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // Soru : Kullanıcı 2 adet bağış almıştır.
        // bunları tam sayı şeklinde para miktarlarını 2 değişkene 500 ve 1000 TL
        // olarak atayınız. Daha sonra toplam bağış miktarını yazdırınız.

        int bagis1=500;
        int bagis2=1000;

        int toplam = bagis1 +bagis2;

        System.out.println("toplam bağış miktarı = " + toplam + " ₺");

        System.out.println("toplam bağış miktarı = " + (bagis1+bagis2) + " ₺");
    }
}
