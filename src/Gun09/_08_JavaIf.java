package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        if (sayi > 0)
            System.out.println("pozitif");

        if (sayi < 0)
            System.out.println("negatif");

        if (sayi == 0)
            System.out.println("sıfır");

        // {} parantezlerini herzaman kullanabilirsiniz ,
        // ancak if şartı sağlandığında çalışacak tek bir komut var ise
        // kullanmak zorunlu değildir.
    }
}
