package Gun07;

public class _06_StringEquals {
    public static void main(String[] args) {
        // Equals : 1 stringi diğeriyle eşit mi sorar
        // sonuç boolean

        String s1="merhaba";
        String s2="MERHABA";

        boolean sonuc= s1.equals(s2);  // s1 s2 ye eşit mi
        System.out.println("esitMi = " + sonuc); // false

        System.out.println("esitMi = " + s1.equals(s2)); // 2.yöntem     false
        System.out.println("esitMi = " + s1.equals("merhaba")); // true
    }
}
