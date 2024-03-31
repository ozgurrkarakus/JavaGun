package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        String sonuc= sayi == 0 ? "Sıfır" : ( sayi > 0 ? "pozitif" : "negatif") ;

        System.out.println("sonuc = " + sonuc);
    }
}
