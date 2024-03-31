package Gun29._03_Protected.bir;

public class HastaneAnkara {
    // merkez hastane
    public static void main(String[] args) {
        Doktor d1=new Doktor();
        d1.adi="İsmet";
        d1.bolum="Dahiliye";
        d1.hastaneAdi="Anakara Hastanesi";
        //d1.sicilNo erişilemez çünkü private

        Doktor d2=new Doktor("Mehmet");
    }

}
