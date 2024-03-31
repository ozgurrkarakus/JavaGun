package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);

        System.out.print("Şifre = ");
        String sifre=oku.nextLine();

        System.out.print("Şifre Tekrar= ");
        String sifreTekrar=oku.nextLine();

        boolean esitMi = sifre.equals(sifreTekrar);

        if (esitMi)
            System.out.println("Eşit");

        if (!esitMi)
            System.out.println("Değil");
    }
}
