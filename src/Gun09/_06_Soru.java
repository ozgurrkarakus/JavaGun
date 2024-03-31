package Gun09;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        // true veya false

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        int kalan= sayi%2; // modül hep kalanı verir

        System.out.println("Tek Mi ? "+ (kalan==1) );  // 1.yöntem

        boolean tekMi= (kalan==1);
        System.out.println("tekMi = " + tekMi);  // 2.Yöntem
    }
}
