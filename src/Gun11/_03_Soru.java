package Gun11;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 456 67

        Scanner oku=new Scanner(System.in);
        System.out.print("Yan Yana 1 boluk ile 2 adet sayı giriniz=");
        String strSayilar=oku.nextLine(); //4567 6

        int boslukIndex= strSayilar.indexOf(" ");
        String strSayi1=strSayilar.substring(0, boslukIndex);
        String strSayi2=strSayilar.substring(boslukIndex+1);

        int sayi1= Integer.parseInt(strSayi1);
        int sayi2= Integer.parseInt(strSayi2);

        if (sayi1 == sayi2)
            System.out.println("EŞİT");
        else
            System.out.println("DEĞİL");

        // 2.Yol
        if (strSayi1.equals(strSayi2))
            System.out.println("EŞİT");
        else
            System.out.println("DEĞİL");
    }
}
