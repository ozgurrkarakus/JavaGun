package Gun08;

public class _06_StringReplace {
    public static void main(String[] args) {
        // replace : bir stringin içindeki karakter/ler verilenle değiştirir
        // hepsini dönüştürür

        String text = "Merhaba Dünya";
        System.out.println("text = " + text);

        System.out.println("text.replace(a,e) = " + text.replace("a","e"));//Merhebe Dünye
        System.out.println("text.replace(ba, de) = " + text.replace("ba","de"));//Merhade Dünya
        System.out.println("text.replace(a, aaa) = " + text.replace("a","aaa")); //Merhaaabaaa Dünyaaa
        System.out.println("text.replace(a,  ) = " + text.replace("a",""));//Merhb Düny
        System.out.println("text.replace(a,***) = " + text.replace("a","***"));//Merh***b*** Düny***
    }
}
