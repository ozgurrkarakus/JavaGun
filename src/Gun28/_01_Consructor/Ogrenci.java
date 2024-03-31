package Gun28._01_Consructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Ogrenci(){ //Bu özel metodlara YAPICI metodlar denir : Consructor
        //nesne oluşturulurken yapılmasını istediklerimizi
        // burada yaptırabiliriz.
        System.out.println("nesne oluşturuldu");
        System.out.println("denize git");
        // veya kendi adın şu olsun
    }

    Ogrenci(int id, String ad, String soyad, int sinif){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinif;
    }

}
