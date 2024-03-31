package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        // normal yöntem
        if (sayi % 2  == 0)
            System.out.println("çift");
        else
            System.out.println("tek");

        //if -else için kısa yöntem

        String sonuc=  sayi % 2  == 0 ? "Evet" : "Hayir";
        // ? if      : değilse
        System.out.println("sonuc = " + sonuc);
    }
}
