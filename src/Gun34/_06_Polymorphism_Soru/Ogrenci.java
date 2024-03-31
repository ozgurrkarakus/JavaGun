package Gun34._06_Polymorphism_Soru;

public class Ogrenci extends Kisi{
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorev, String subesi) {
        super(ad, soyad, gorev);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
