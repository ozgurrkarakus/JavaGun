package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) { // 1- başla
        // Baklava dilimi , if
        // Girilen bir sayı 10 dan büyük ise "10 dan büyük yazınız"
        // 1- Başla
        // 2- sayi oku
        // 3- sayi > 10 ise "10 dan büyük yaz"
        // 4- dur

        //2- sayi oku
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        // 3- sayi > 10 ise
        if (sayi > 10) // şartın sonunda ; yok, normal parantez şart
        {   // if in şartı sağlandığında çalışacak bölüm
            System.out.println("10 dan büyük"); //10 dan büyük yaz"
        } // curly braces

    } // 4-dur
}
