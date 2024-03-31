package Gun28._04_Consructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
    }

    public Banka(String adi) {
        this.adi = adi;
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
