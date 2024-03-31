package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        double rastgeleSayi= Math.random();  // veri almayan, ama geriye veri döndürüyor
        int max = Math.max(5,6);   // veri alıyor, geriye veri döndürüyor
        System.out.println(); // veri almıyor, geriye veri de döndürmüyor

        System.out.println("Merhaba Dünya"); // veri alıyor, geriye dönüş yok
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();//veri almıyor, geri bir şey göndermiyor
        merhabaYaz();
        merhabaYaz();
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya_metod");
    }

}
