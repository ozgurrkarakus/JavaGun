package Gun09;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner  oku=new Scanner(System.in);

        System.out.print("Sayi1=");
        int sayi1=oku.nextInt();

        System.out.print("Sayi2=");
        int sayi2=oku.nextInt();

        System.out.println("Eşit Mi = " + (sayi1==sayi2)); // 1.yöntem

        boolean esitMi= (sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);  //2.yöntem
    }
}
