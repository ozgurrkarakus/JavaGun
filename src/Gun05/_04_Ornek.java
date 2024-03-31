package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı ve soyadınızı giriniz=");
        String adSoyad=oku.nextLine();

        System.out.println("adSoyad = " + adSoyad);
    }
}
