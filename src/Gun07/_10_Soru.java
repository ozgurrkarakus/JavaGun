package Gun07;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)
        // mesala İsmet Temur -> İsmet i ayrı yazdırın, Temur u yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("Ad ve Soyad= ");
        String adSoyad= oku.nextLine();

        int boslukIndex = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, boslukIndex);
        String soyad = adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
