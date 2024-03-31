package Gun34._06_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Kisi cal=new Calisan("Ayşe","Yılmaz",
                "Yazılım","BIM");
        Kisi ogr=new Ogrenci("Ali","Demir",
                "Öğrenci","5A");

        cal.kimlikYaz(cal);
        ogr.kimlikYaz(ogr);

    }
}
