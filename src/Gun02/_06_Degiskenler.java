package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
        int sayi; // bana int miktarınca bir tam sayı saklayacak kadar yer ayır
                  // dedim, adına sayi dedim

        int Sayi; // sayi Sayi tamamen farklıdır a ve z gibi farklıdır
        int saYi; // tamamen farklı
        int toplam;  // isim manalı olmalı, bakınca ne için kullanıldığı anlaşılmalı
                     // ne de yazma zorluğu oluşturacak kadar uzun olmamalı.

        sayi=5;   // hafızadaki sayı isimli yere 5 değerini atadım
        System.out.println("sayi"); // "" arasında olursa aynen yazarım
        System.out.println(sayi);  // DEĞERİNİ yazarım, Değişken adı olduğunu biliyorum

        // Sayi Değeri=5  gibi güzel bir çıktı vermek istiyorum
        System.out.print("Sayi Değeri=");
        System.out.println(sayi);

        // tek bir printte nasıl yazardım aynısını ?
        System.out.println("Sayi Değeri="+sayi);
        // + nın manası bir taraf kelime olunca birleştirmedir
    }
}
