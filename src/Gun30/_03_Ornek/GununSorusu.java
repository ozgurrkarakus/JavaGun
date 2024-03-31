package Gun30._03_Ornek;

public class GununSorusu {
    
    int a; //her nesnenin a sı var
    
    static int b=0; // sen bi tanesin, tipe ait sadece 1 tane

    void artir()
    {
        a++;
        b++;
    }


    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        //Soru 1 : a nın değeri şu anda kaç oldu ?
        // a yı yazdırsam kaç yazar
        // Verilecek cevap şu : Hocam hangi a yı soruyorsun,
        System.out.println("gs1.a = " + gs1.a); // 5, b=0
        System.out.println("gs2.a = " + gs2.a); // 7, b=0
        
        //Soru 2 : b nin değeri şu anda kaçtır ?
        System.out.println("GununSorusu.b = " + GununSorusu.b);// 0

        //Soru 3 :
        gs1.artir(); // gs1.a sı 1 tane arttı : 6  , b 1 arttı
        gs2.artir(); // gs2.a sı 1 tane arttı : 8  , b 1 arttı
        // Şu anda a nın ve b nin değeri kaçtır

        System.out.println("gs1.a = " + gs1.a); // 6
        System.out.println("gs2.a = " + gs2.a); // 8
        System.out.println("GununSorusu.b = " + GununSorusu.b); // 2
    }
    
    
}
