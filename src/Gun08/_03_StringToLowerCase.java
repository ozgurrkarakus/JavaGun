package Gun08;

public class _03_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi küçük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("text = " + text); // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase());// merhaba dünya

        System.out.println("text.startsWith(m) = " + text.startsWith("m")); //false
        System.out.println(text.toLowerCase().startsWith("m")); //true
    }
}
