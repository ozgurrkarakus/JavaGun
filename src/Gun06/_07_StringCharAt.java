package Gun06;

public class _07_StringCharAt {
    public static void main(String[] args) {
        // charAt(index) ; istenen noktadaki karakteri verir
        //                      111
        //            0123456789012
        String cumle="Merhaba Dünya"; // uzunluk 13
        System.out.println("cumle.length() = " + cumle.length());

        char ilkHarf=cumle.charAt(0); // 0 oda numaralı , yani indexli karakter
        System.out.println("ilkHarf = " + ilkHarf);
    }
}
