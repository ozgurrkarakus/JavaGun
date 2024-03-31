package Gun06;

public class _06_StringLength {
    public static void main(String[] args) {
        // StringLength  -> bir Stringin uzunluğunu verir.(Kaç tane harf var)

        String cumle="Bugün hava çok yağmurlu"; //boşluk da bir harf gibidir.

        int uzunluk=cumle.length(); // cumlenin içindeki değerin kaç harf olduğunu verir

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + cumle.length()); // 2.seçenek
    }
}
