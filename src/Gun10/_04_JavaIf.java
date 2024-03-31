package Gun10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR veya YOK şeklinde

//        hava  -> var desin
//        HAVA  -> var desin

        Scanner oku= new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        cumle = cumle.toUpperCase();

        if (cumle.contains("A"))
            System.out.println("VAR");

        if (!cumle.contains("A"))
            System.out.println("YOK");


        /********* farklı yontem  ******************/

        String aSizCumle = cumle.replace("A","").replace("a","");
        //String aSizCumle = cumle.replaceAll("[aA]","");

        if (aSizCumle.length() == cumle.length())
            System.out.println("YOK");

        if (aSizCumle.length() != cumle.length())
            System.out.println("VAR");



    }
}





