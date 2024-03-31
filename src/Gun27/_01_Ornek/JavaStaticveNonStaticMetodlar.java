package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {

    public static void main(String[] args) {
       Utility u=new Utility();//nesne

       int rndSayi1=u.randomSayiVer(10);
       // nesne ye bağlı (static yok)
       // metodun içinde nesneye ait özellikler(field)
       // kullanılacaksa, yani içinde this le belirtilen
       // değişkenler kullanılacaksa STATIC YOK

       int rndSayi2=Utility.randomSayiVer2(10);
       // static : zaten var, oluşturulmaya ihtiyacı yok
       // yani nesnenin oluşturulmasına ihtiyaç yok
       // tipin adı ile direk kullanılabilir.
       // içinde NESNE ye ait değişkenler kullanılmayacak
       // ise ozaman hızlı ve pratik kullanım için
       // ve programları her yerinden direk çağırabilmek ,
       // için STATIC kelimesi eklenir.
       // Math.Max() gibi kulalnılacak tool lar için
       // static kullanılır. STATIC metodların içinden
       // ANCAK direk olarak STATİC metodları çağrılabilir.
       // Bir diğer kullanım amacı: TİPİ ilgilendiren
       // metodlar içinde STATİC Kullanılılabilir.
    }





}
