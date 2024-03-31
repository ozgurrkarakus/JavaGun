package Gun35._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        Kare k=new Kare();
        k.ciz();
        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir d2=new Dikdortgen();
    }
}
