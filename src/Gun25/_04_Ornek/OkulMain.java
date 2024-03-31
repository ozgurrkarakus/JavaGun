package Gun25._04_Ornek;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        Ogrenci ogr1=new Ogrenci();

        System.out.print("Öğrenci Adı=");ogr1.adi=okuStr.nextLine();
        System.out.print("Öğrenci Soyadı=");ogr1.soyadi=okuStr.nextLine();
        System.out.print("Öğrenci Sınıfı=");ogr1.sinifi=okuInt.nextInt();
        System.out.print("Öğrenci Adres=");ogr1.adres=okuStr.nextLine();

        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);
        System.out.println("ogr1.sinifi = " + ogr1.sinifi);
        System.out.println("ogr1.adres = " + ogr1.adres);
    }
}
