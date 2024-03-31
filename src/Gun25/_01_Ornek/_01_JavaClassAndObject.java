package Gun25._01_Ornek;

// tiplerin yani class ların tanımlandığı yer

import java.util.ArrayList;
import java.util.Scanner;

public class _01_JavaClassAndObject {

    // method
    public static void main(String[] args) {
        //ana method : programın başladığı ve bittiği yer
        int sayi;
        Scanner oku=new Scanner(System.in);
        ArrayList<Integer> liste=new ArrayList<>();

        Araba benimArabam=new Araba();
        benimArabam.renk="kırmızı";
        benimArabam.yili=2024;
        benimArabam.motorHacmi=1600;
        benimArabam.marka="Togg";

        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
    }
    //metod
}

// tiplerin yani class ların tanımlandığı yer
class Araba {
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}