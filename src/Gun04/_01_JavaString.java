package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {
        int sayi = 0; //int: tipi,   sayi: değişkenin adı,   0:başlangıç değeri

        String ad = "ismet";

        System.out.println("sayi = " + sayi); // sayi = 0
        System.out.println("ad = " + ad);     // ad = ismet

        String soyad = "Temur";
        System.out.println("soyad = " + soyad); // soyad = Temur

        String tamAd = ad + " " + soyad;  //+ sayılarda toplama, kelimelerde ekleme
        System.out.println("tamAd = " + tamAd); // tamAd = ismet Temur

        System.out.println("tamAd = " + ad + " " + soyad); // 2.yöntem
    }
}
