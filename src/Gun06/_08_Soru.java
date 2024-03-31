package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son Harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        int uzunluk = cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1); // SON HARF
        System.out.println("sonHarf = " + sonHarf);
    }
}
