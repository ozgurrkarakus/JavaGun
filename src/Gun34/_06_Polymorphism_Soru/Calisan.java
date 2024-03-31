package Gun34._06_Polymorphism_Soru;

public class Calisan extends Kisi{
    private String deparman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        setDeparman(departman);
    }

    public String getDeparman() {
        return deparman;
    }

    public void setDeparman(String deparman) {
        this.deparman = deparman;
    }
}
