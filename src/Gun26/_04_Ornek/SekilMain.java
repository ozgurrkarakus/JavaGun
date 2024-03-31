package Gun26._04_Ornek;

public class SekilMain {
    public static void main(String[] args) {
        Rectangle d=new Rectangle();
        d.length=4;
        d.width=5;

        d.Alan(); // kendi değerleri alıp, işlem yapıp, yazdırıyor
        d.Cevre();

        int alani=d.Alan2();
        System.out.println("alani = " + alani);

        d.degerAta(6,8);
        d.Alan();
        d.Cevre();
    }



}
