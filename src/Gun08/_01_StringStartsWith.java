package Gun08;

public class _01_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith("") : bunun la başlıyor mu ?
        // boolean

        String text="Manisa";

        System.out.println("text.startsWith(M) = " + text.startsWith("M")); // true
        System.out.println("text.startsWith(Man) = " + text.startsWith("Man")); // true
        System.out.println("text.startsWith(ni) = " + text.startsWith("ni")); // false
    }
}
