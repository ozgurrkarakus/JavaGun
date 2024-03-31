package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot = oku.nextInt();

        // 1.yönte bilgisayar boş yere yoruluyor
        if (ogrNot >= 50)
            System.out.println("Geçtiniz, Tebrikler");

        if (ogrNot < 50) {
            System.out.println("üzgünüz, kaldınız");
            System.out.println("yaz okuluna bekleriz");
        }

        // 2.Yöntem olması gereken
        if (ogrNot >=50)
            System.out.println("tebrikler");
        else //yukarı şart değilse
            System.out.println("kaldınız");

    }
}

// {} parantezlerini herzaman kullanabilirsiniz ,
// ancak if şartı sağlandığında çalışacak tek bir komut var ise
// kullanmak zorunlu değildir.