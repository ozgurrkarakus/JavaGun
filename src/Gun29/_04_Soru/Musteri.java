package Gun29._04_Soru;

public class Musteri {
    int musteriNo;
    String ad;
    String soyad;
    Hesap musteriHesap=new Hesap();

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriNo=" + musteriNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", musteriHesap=" + musteriHesap +
                '}';
    }
}
