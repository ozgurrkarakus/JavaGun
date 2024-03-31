package Gun34._03_Protected.Paket1;

public class P1Hayvan {
    public String ad; //  her yerden
    int yas;          //  sadece kendi paketinden
    protected String cinsi; // sadece kendi paketinden + extend edilen diğer classlardan
    private String renk;  // sadece classın içinde
}
