package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        // tek veya çift şeklinde yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int kalan= sayi%2;  // bu sayının kalanı kaç

        if (kalan == 0)
            System.out.println("çift sayı");

        if (kalan == 1)
            System.out.println("tek sayı");
    }
}

//        1,3,5,9,1003,57
//        bunları da hep 2 ye bölersem kalan 1
//
//        246,1000,40
//        bunları 2 ye bölersem kalan hep 0