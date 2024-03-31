package Gun26._05_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.name="Şeyma Nur";
        // mus1 : nesne,
        // Musteri : Tür,class,Tip

        mus1.eHesabi.tuketimEkle(100); // Ocak
        mus1.eHesabi.tuketimEkle(200); // Şubat
        mus1.eHesabi.tuketimEkle(220); // Mart

        System.out.println("toplamTuketim = " + mus1.eHesabi.toplamTuketim);
        mus1.eHesabi.faturaYaz(mus1.name);
    }
}
