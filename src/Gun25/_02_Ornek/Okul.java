package Gun25._02_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.adi="Kaan";
        ogr1.soyadi="Gül";
        ogr1.adresi="Üsküdar";
        ogr1.sinifi=12;

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);
        System.out.println("ogr1.sinifi = " + ogr1.sinifi);
        System.out.println("ogr1.adresi = " + ogr1.adresi);
    }
}

class Ogrenci{
    int okulNo;
    String adi;
    String soyadi;
    int sinifi;
    String adresi;
}