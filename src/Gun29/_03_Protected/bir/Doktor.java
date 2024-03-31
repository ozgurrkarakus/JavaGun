package Gun29._03_Protected.bir;

public class Doktor {
    public String hastaneAdi;//herkes
    String adi; //aynı pakettekiler
    protected String bolum; //aynı pakettekiler
    private String sicilNo; // sadece bu class ın içinden

    Doktor() { //kendi paketinden erişim
    }

    public Doktor(String adi) { // herkes
        this.adi = adi;
    }
}
