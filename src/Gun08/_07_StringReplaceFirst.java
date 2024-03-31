package Gun08;

public class _07_StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst : bir stringin içindeki karakter/lerin sadece ilkini
        // verilenle değiştirir

        String text = "Merhaba Dünya";
        System.out.println("text = " + text);

        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e"));//Merheba Dünya
        System.out.println("text.replaceFirst(ba, de) = " + text.replaceFirst("ba","de"));//Merhade Dünya
        System.out.println("text.replaceFirst(a, aaa) = " + text.replaceFirst("a","aaa")); //Merhaaaba Dünya
        System.out.println("text.replaceFirst(a,  ) = " + text.replaceFirst("a",""));//Merhba Dünya
        System.out.println("text.replaceFirst(a,***) = " + text.replaceFirst("a","***"));//Merh***ba Dünya
    }
}
