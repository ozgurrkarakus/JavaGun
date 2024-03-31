package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1 = 9;
        byte ogrNot2 = 9;
        byte ogrNot3 = 9;
        byte ogrNot4 = 10;

        //toplam notu bulmak istiyorum
        int toplamNot = ogrNot1 + ogrNot2 + ogrNot3 + ogrNot4;

        byte toplamNot2=  (byte)toplamNot;  //büyük kovayı , küçük boşaltıyorsun
        // int -> byte atınca dur bakalım dedi   (DARALTMA)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma
        // işlemi var. veri kaybı ihtimali var
    }
}
