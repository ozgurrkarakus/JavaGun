package Gun09;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int toplam = 0, sayi = 1;

        toplam = toplam + sayi;   // toplama sayıyı ekle : 1 oldu toplam
        sayi = sayi + 1;          // sayi yi 1 artır

        // bu 2 satırı tek satırda yazabilirsin diyor
        toplam=0; sayi=1; // başlangıç değerlerine getirildi

        toplam = toplam + sayi++; // toplam =1, sayi =2
        // ++ sadece sayıyı etkiler

        /*********************************************/
        toplam=0; sayi=1; // başlangıç değerlerine getirildi

        sayi=sayi+1;
        toplam=toplam+sayi;         // sayi=2,  toplam=2

        //bu iki satır yerine tek satırda şöyle yazabilirsin
        toplam=0; sayi=1; // başlangıç değerlerine getirildi

        toplam = toplam +  ++sayi;   // sayi=2,  toplam=2

        //  ++ sonra ise, önce işlem, sonra artış
        //  ++ önce ise, önce artış,  sonra işlem



    }
}









