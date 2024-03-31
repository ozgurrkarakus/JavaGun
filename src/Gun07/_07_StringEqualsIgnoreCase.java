package Gun07;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // EqualsIgnoreCase
        // equals aynı çalışır sadece büyük küçük harf ayrımı yapmaz

        String s1="meRhaba";
        String s2="MERhABa";

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // true
    }
}
