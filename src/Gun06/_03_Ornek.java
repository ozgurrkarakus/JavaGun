package Gun06;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuzu giriniz(kg)=");
        double kilo=oku.nextDouble();

        System.out.print("Boyunuzu giriniz(m)=");
        double boy=oku.nextDouble();

        double kitleIndex= kilo / (boy*boy);
        System.out.println("Boyunuz="+boy+", kilonuz="+kilo);
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
