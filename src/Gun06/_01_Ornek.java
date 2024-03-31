package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgen tarlanın gerekli kenar(int) uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b
        Scanner oku=new Scanner(System.in);

        System.out.print("Uzun Kenarı giriniz=");
        int uzunKenar = oku.nextInt();

        System.out.print("Kısa Kenarı giriniz=");
        int kisaKenar = oku.nextInt();

        int cevre=uzunKenar+uzunKenar+kisaKenar+kisaKenar;
        int alan = uzunKenar*kisaKenar;

        System.out.println("Cevre = " + cevre);
        System.out.println("alan = " + alan);
        // ctrl+z   -> yapılan işlemi geri alır
        // ctrl+y   -> geri alınmış işlemleri tekrar yazar
    }
}
