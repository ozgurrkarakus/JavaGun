package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // 1. küçük alanı -> büyüğe atılabiliyor (genişleme-Widening)
        // byte-> short-> int-> long-> float-> double
        // veri kaybı kesinlikle yok

        int sayi=9;
        long toplam=500;
        double oran=3.2;

        //sol taraf değer alan taraftır, sağ taraf değer veren tarafır
        oran = sayi; // int ->  double  genişleme yönünde
        System.out.println("oran = " + oran);  // veri kaybı ihtimali yok

        toplam=sayi; // int -> long  genişleme yönünde
        System.out.println("toplam = " + toplam); // veri kaybı ihtimali yok

        oran=toplam; // long -> double genişleme yönünde
        System.out.println("oran = " + oran); // veri kaybı ihtimali yok

    }
}
