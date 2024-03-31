package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // (int)(Math.Random()*10)   -> 0-9,  0-19 , 0-29
        // 20-30 arasını istiyorum desen => 10 kadar üret sonra 20 ekle
        // aralık nedir ?
        // 1) aralık kadra üret   0- 9
        // 2) min umumu çıkan sonuca ekle: 20- 29


        // Girilen min ve max aralığı sayı üretiniz
        Scanner oku=new Scanner(System.in);
        System.out.print("min (alt sınır) = ");
        int min=oku.nextInt();

        System.out.print("max (ust sınır) = ");
        int max=oku.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)) + min;
        //aralık kadar üret , sonra min i ekle
        System.out.println("rndSayi = " + rndSayi);
    }
}
