package Gun08;

public class _08_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) :  regex olarak neler yazılabiliyor google dan araştırılacak
        String text="Merhaba12 Dünya23";

        System.out.println("text = " + text);
        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_")); // abn yi _ ile değiştir
        System.out.println("123 ->   = " + text.replaceAll("[123]","")); // 123 ü sil
        System.out.println("0-9 ->   = " + text.replaceAll("[0-9]","")); // 0-9 arasındakileri sil
        System.out.println("a-z ->   = " + text.replaceAll("[a-z]","")); // a-z arasındakileri sil
        System.out.println("0-9 ->   = " + text.replaceAll("[^0-9]","")); // 0-9 DIŞINDAKİLERi sil
        System.out.println("A-Z ->   = " + text.replaceAll("[A-Z]","")); // A-Z arasındakileri sil

        System.out.println(text.replaceAll("[A-Z]","").replaceAll("[a-z]","")); // tüm harfleri siler
    }
}
