package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi1 = ");
        int sayi1=oku.nextInt();

        System.out.print("Sayi2 = ");
        int sayi2=oku.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("Toplam = " + toplam); // 1.Yöntem

        System.out.println("Toplam = " + (sayi1+sayi2)); // 2.Yöntem
    }
}
