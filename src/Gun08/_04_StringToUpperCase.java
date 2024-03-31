package Gun08;

public class _04_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : stringin büyük hafr halini verir

        String text="merhaba dünya";

        System.out.println("text = " + text); // merhaba dünya
        System.out.println("text.toUpperCase() = " + text.toUpperCase());//MERHABA DÜNYA

        System.out.println("text.startsWith(M) = " + text.startsWith("M")); // false
        System.out.println("text.toUpperCase().startsWith() = " +
                                       text.toUpperCase().startsWith("M")); // true

    }
}
