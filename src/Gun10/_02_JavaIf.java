package Gun10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 ve 50 den büyükse
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrenci notu=");
        int ogrNot= oku.nextInt();

        if (ogrNot >= 50)
            System.out.println("Geçtiniz, tebrikler");

        if (ogrNot < 50)
            System.out.println("Üzgünüz, kaldınız");
    }
}
