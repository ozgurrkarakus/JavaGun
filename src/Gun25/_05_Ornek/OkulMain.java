package Gun25._05_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci[] sinif =new Ogrenci[3]; // içi boş şu anda öğrenci tipi var burada

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        for (int i = 0; i < sinif.length; i++) {
            Ogrenci ogr=new Ogrenci();   // sinif[i]=new Ogrenci();
            System.out.print("Öğrenci Adı=");ogr.ad=okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");ogr.soyad=okuStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");ogr.sinif=okuInt.nextInt();
            System.out.print("Öğrenci Adres=");ogr.adres=okuStr.nextLine();
            sinif[i]=ogr;
        }

        for (int i = 0; i < sinif.length; i++) {
            System.out.println("ogr1.adi = " + sinif[i].ad);
            System.out.println("ogr1.soyadi = " + sinif[i].soyad);
            System.out.println("ogr1.sinifi = " + sinif[i].sinif);
            System.out.println("ogr1.adres = " + sinif[i].adres);
        }

        /*********************************/
        ArrayList<Integer> notlar=new ArrayList<>();  // istediğini kadar Integer ekle
        ArrayList<Ogrenci> sinif2=new ArrayList<>();  // istediğin kadar Öğrenci ekle

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci Adı=");ogr.ad=okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");ogr.soyad=okuStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");ogr.sinif=okuInt.nextInt();
            System.out.print("Öğrenci Adres=");ogr.adres=okuStr.nextLine();
            sinif2.add(ogr);
        }

        for(Ogrenci ogr: sinif2){
            System.out.println("ogr1.adi = " + ogr.ad);
            System.out.println("ogr1.soyadi = " + ogr.soyad);
            System.out.println("ogr1.sinifi = " + ogr.sinif);
            System.out.println("ogr1.adres = " + ogr.adres);
        }

    }
}
