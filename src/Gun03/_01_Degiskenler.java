package Gun03;

public class _01_Degiskenler {

    public static void main(String[] args) {
        // ctrl+alt+l   yazıları düzeltir

        int toplam;    // değişken tanımlarken ilk değer vermek mecburi değil
        int sayac = 0; // değişken tanımlarken ilk değer verilebilir
        System.out.println(sayac);

        sayac = sayac + 2;  // 2
        System.out.println("sayac=" + sayac); // sayac=2
        // + işareti rakamlar arasında olursa toplar
        // + işareti bir kelime ile beraber kullanılırsa yanına ekler

        System.out.println(); // işlem sonrası satır, burada işlem yok, ozaman alt satıra geç
        System.out.println("merhaba");  // sabit yazıyı ekran ayazar
        System.out.println("sayac"); // ekrana sabit sayac kelimesini yazar
        System.out.println(sayac); // ekrana sayac isimli değişkenin değerini yazar

        System.out.println("sayac=" + sayac);
    }
}
