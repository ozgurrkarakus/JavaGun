package Gun07;

public class _05_StringContains {
    public static void main(String[] args) {
        // contains : aranan harf/ler stringin içinde var mı yok mu onu verir
        // boolean cinsinden sonucu verir

        String cumle="Merhaba Dünya";

        boolean varMi= cumle.contains("a");  //  true
        System.out.println("varMi = " + varMi);

        System.out.println("varMi a="+ cumle.contains("a")); //2.yöntem
        System.out.println("varMi ya="+ cumle.contains("ya")); // true
        System.out.println("varMi z="+ cumle.contains("z")); //false
        System.out.println("varMi aü="+ cumle.contains("aü")); // false
    }
}
