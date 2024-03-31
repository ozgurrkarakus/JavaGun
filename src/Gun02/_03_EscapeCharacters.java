package Gun02;

public class _03_EscapeCharacters {

    public static void main(String[] args) {
        /*
        Escape Characters
               \n   -> yeni satır aç, alt satıra geç
               \t   -> tab tuşuna basılmış gibi yapar, 2,3 karakterlik boşluk oluşturur
               \b   -> backspace tuşuna basma etkisi, yani 1 karakter geri siler
               \"   -> çift tırnak " yazmak için kullanılır
               \\   -> slaç yani \  yazdırmak için kullanılır
               \r   -> bulunduğu satırın başına git
         */

        System.out.println("MerhabaDünya");   //MerhabaDünya
        System.out.println("Merhaba\nDünya"); //Merhaba  alt satıra geç Dünya
        System.out.println("Merhaba\tDünya"); //Merhaba   Dünya
        System.out.println("Merhaba\bDünya"); //MerhabDünya
        System.out.println("Merhaba\"Dünya"); //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); //Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); //Dünya
    }

}
