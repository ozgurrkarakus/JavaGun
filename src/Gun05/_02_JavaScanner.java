package Gun05;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {

        //tipi     adı      ilk değeri , arabalardan yeni araba
        Scanner okuyucu = new Scanner(System.in);
        // Bilgisayarlardan MyPc = yeni Bilgisayar();
        // System.in  : klavyeden okuma görevi verildi okuyucuya

        System.out.print("Sayi giriniz=");  // ne istendiği bilnsin diye yazıldı
        int girilenSayi= okuyucu.nextInt(); // bu komutla sayı girilmesini bekliyor
        //okuduğun sayıyı bana ver

        System.out.println("girilenSayi = " + girilenSayi);
        System.out.println("bitti");
    }
}
