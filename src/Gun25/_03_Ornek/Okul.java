package Gun25._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        ogr1.okulNo=2001;
        ogr1.ad="Cilem";
        ogr1.soyad="Okkali";
        ogr1.sinif=12;
        ogr1.adres="Kadıköy";

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1.soyad = " + ogr1.soyad);
        System.out.println("ogr1.sinif = " + ogr1.sinif);
        System.out.println("ogr1.adres = " + ogr1.adres);
    }
}


