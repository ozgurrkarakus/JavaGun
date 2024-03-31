package Gun09;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi 1 =");
        int sayi1 = oku.nextInt();

        System.out.print("Sayi 2 =");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("sayi1 büyük ="+sayi1);

        if (sayi1 < sayi2)
            System.out.println("sayi2 büyük ="+sayi2);

        if (sayi1 == sayi2)
            System.out.println("sayi1 ve sayi2 eşit");
    }
}
