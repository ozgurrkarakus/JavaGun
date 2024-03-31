package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi=");
        int sayi=oku.nextInt();

        //1.yöntem
        int kalan= sayi % 2;

        if (kalan==0)
            System.out.println("Çift sayı");
        else
            System.out.println("tek sayı");

        //2.yöntem
        if (sayi%2 ==0)
            System.out.println("Çift sayı");
        else
            System.out.println("tek sayı");
    }
}
