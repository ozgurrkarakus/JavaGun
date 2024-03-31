package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 50 tl, 5 saate kadar 100 tl, 5 den buyukse 120 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        // eğer saat < 3 ise   50 tl yaz
        // eğer saat >= 3 ve  saat < 5 ise 100 tl yaz
        // eğer saat >= 5 ise 120 tl yaz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir saat giriniz=");
        int saat=oku.nextInt();

        if ( saat < 3)
            System.out.println("Ücret = 50 tl");

        if (saat >= 3 && saat < 5)
            System.out.println("Ücret = 100 tl");

        if (saat >= 5)
            System.out.println("Ücret = 120 tl");


        // if ve else li hali

        if ( saat < 3)
            System.out.println("Ücret = 50 tl");
        else
        {
            if (saat <5)
                System.out.println("Ücret = 100 tl");
            else
                System.out.println("120 tl");
        }


    }
}
