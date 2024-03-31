package Gun11;

import java.util.Scanner;

public class _07_JavaTernary {
    public static void main(String[] args) {
        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 50 tl, 5 saate kadar 100 tl, 5 den buyukse 120 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        // eğer saat < 3 ise   50 tl yaz
        // eğer saat >= 3 ve  saat < 5 ise 100 tl yaz
        // eğer saat >= 5 ise 120 tl yaz

        Scanner oku=new Scanner(System.in);
        System.out.print("Saat=");
        int saat=oku.nextInt();

        // String olarak     ? -> if      : -> else
        String strUcret= (saat < 3 ? "50 tl" :   ( saat < 5 ? "100tl" : "120tl")    );
        System.out.println("strUcret = " + strUcret);

        // int olarak
        int ucret = ( saat < 3 ? 50 : ( saat < 5 ? 100 : 120 ));
        System.out.println("ucret = " + ucret+" tl");
    }
}








