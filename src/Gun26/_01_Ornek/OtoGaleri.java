package Gun26._01_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {
    public static void main(String[] args) {
        ArrayList<Araba> galeri=new ArrayList<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Araba a=new Araba();

            System.out.print("Araba No="); a.arabaNo = okuInt.nextInt();
            System.out.print("Araba Markası="); a.marka = okuStr.nextLine();
            System.out.print("Araba Üretim Yılı="); a.uretimYili = okuInt.nextInt();

            galeri.add(a);
        }

        galeriYazdir(galeri); // gideni var, döneni yok
        uretimYiliOrtamalasiYaz(galeri); // gideni var, döneni yok
        int ort=uretimYiliOrtamalasiBulVer(galeri); // gideni var, var
        System.out.println("ort = " + ort);
    }

    public static int uretimYiliOrtamalasiBulVer(ArrayList<Araba> galeri){
        int toplamUretimYili=0;
        for(Araba a : galeri)
            toplamUretimYili= toplamUretimYili+ a.uretimYili;

        return toplamUretimYili/galeri.size();
    }

    public static void uretimYiliOrtamalasiYaz(ArrayList<Araba> galeri){
        int toplamUretimYili=0;
        for(Araba a : galeri)
            toplamUretimYili= toplamUretimYili+ a.uretimYili;

        System.out.println("Ortalama="+ (toplamUretimYili/galeri.size()) );
    }

    public static void galeriYazdir(ArrayList<Araba> galeri){
        for(Araba a : galeri)
            System.out.println(a.arabaNo+" "+a.marka+" "+a.uretimYili);
    }



}
