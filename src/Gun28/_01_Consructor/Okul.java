package Gun28._01_Consructor;

import java.util.Scanner;

public class Okul {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        Ogrenci ogr1=new Ogrenci(); // nesnenin oluşma anı
        ogr1.id=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinifi=5;
        System.out.println(ogr1.ad);

        Ogrenci ogr2=new Ogrenci(2,"Ali","Veli",6);
        System.out.println(ogr2.ad);
    }

}
