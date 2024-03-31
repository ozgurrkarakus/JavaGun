package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer ayırır, sadece tam sayı atılır

        // tam sayılar
        byte byteDeger=7;        // -128 , 127  arası kadar olan sayılar için kullanılar
        short shortDeger= 1645;  // -32000, 32000 arası
        int intDeger=2500000;    // -2,5 mil, +2,5 mil,  java rakam gördüğünde direk int düşünür,DEFAULT
        long longDeger= 3333444444444l; // default olarak rakamlar ı int kabul ettiğinden
                                        // uzun rakamlarda mutlak sonuna l konulmalı.

        // küsüratlı, ondalıklı sayılar
        double doubleDeger= 3.14343455555667777; // noktadan sonra 16 hane hassayiyeti var,DEFAULT
        float floatDeger=3.141233f;  // Kararsız değişken olarak adlandırıldığı için,
                                     // az yer kaplasa da, tercih edilmez

        // kelime, harf
        char basHarf='A';   // harfler tek tırnak arasında yazılır
        String isim="ismet"; // kelimeler sabit olduğundan çift tırnak arasında yazılır ,

        // so ya bastığınızda soutv seçilirse , değişken yazılacağınız anlar, ve kendisi formatlı yazdırır
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);

        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);

        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


    }
}
