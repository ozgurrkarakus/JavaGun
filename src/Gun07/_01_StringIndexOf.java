package Gun07;

public class _01_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf(harf/ler) -> verilen harf/ler in Index ini ver
        // Bugün     IndexOf("B") -> 0 verir

        //            012345678
        String cumle="Merhaba Dünya";
        // h nin oda numarası kaç 3
        // a nın oda numarası kaç 4
        // Dü nün indexi kaç  8

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h")); // 3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(Dü) = " + cumle.indexOf("Dü")); // 8
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); //  -1  yok
        System.out.println("cumle.indexOf(z) = " + cumle.indexOf("z")); // -1

        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5)); // 6
                    // 5 den sonra aramaya başla

        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a", 7)); // 12
                   // 7 den sonra aramaya başla
    }
}
