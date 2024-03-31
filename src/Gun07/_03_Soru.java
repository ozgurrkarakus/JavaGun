package Gun07;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Ismet Temur" ->  I.T.  şeklinde yazdırınız.

        // Ismet Temur   ->   ilkHarf = charAt(0)
        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız=");
        String adSoyad=oku.nextLine();

        char ilkHarf = adSoyad.charAt(0); // ilk harfi verir herzaman
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // harfi aldım

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");
    }
}
