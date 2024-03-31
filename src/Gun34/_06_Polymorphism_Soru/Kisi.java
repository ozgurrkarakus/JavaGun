package Gun34._06_Polymorphism_Soru;
//super
public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public void kimlikYaz(Kisi gelenKisi){ //calisan , öğrenci
        System.out.println("\n***** Kimlik Belgesi ****");
        System.out.println("ad = " + this.ad);
        System.out.println("soyad = " + gelenKisi.getSoyad());
        System.out.println("görevi = " + gelenKisi.getGorev());

        if (gelenKisi instanceof Calisan) //gelen aslında çalışansa
            System.out.println("Departmanı = " + ((Calisan)gelenKisi).getDeparman());

        if (gelenKisi instanceof Ogrenci) //gelen aslında öğrenci ise
            System.out.println("Şubesi = " + ((Ogrenci)gelenKisi).getSubesi());
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
