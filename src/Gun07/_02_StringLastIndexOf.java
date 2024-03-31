package Gun07;

public class _02_StringLastIndexOf {
    public static void main(String[] args) {
       // indexOf : Baştan aramaya başlar , oda numarasını veririr
       // LastIndexOf : sondan aramaya başlar, yine oda numarasını verir
       // oda numaraları, yani index hep aynıdır, arama yönüne göre DEĞİŞMEZ

        //           0123456789012
       String cumle="Merhaba Dünya";

        System.out.println("indexOf(a) = " + cumle.indexOf("a")); //4
        System.out.println("lastIndexOf(a) = " + cumle.lastIndexOf("a")); //12
    }
}
