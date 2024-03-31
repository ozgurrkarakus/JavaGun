package Gun06;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde(string), Sokak(string) , PostaKodu(int) ve ülke(string)
        // evSahibi(boolean) şeklinde adres bilgisini alarak bir satırda yazdırınız.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okuBool=new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde= okuStr.nextLine();

        System.out.print("Sokak=");
        String sokak= okuStr.nextLine();

        System.out.print("PostaKod=");
        int postaKod= okuInt.nextInt();

        System.out.print("Ülke=");
        String ulke= okuStr.nextLine();

        System.out.print("Ev Sahibi misiniz(t/f) =");
        boolean evSahibi= okuBool.nextBoolean();

        System.out.println(cadde+" "+sokak+" "+postaKod+" "+ulke+" "+evSahibi);

    }
}
