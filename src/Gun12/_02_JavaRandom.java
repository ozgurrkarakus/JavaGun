package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
        // mesala 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalışayım

        Scanner oku=new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı=");
        int sinir=oku.nextInt();

        int tutulanSayi= (int)(Math.random()*sinir);

        System.out.print("Tahmininiz=");
        int tahmin=oku.nextInt();

        if (tutulanSayi == tahmin)
            System.out.println("Tebrikelr bildiniz");
        else
            System.out.println("Bilemedin ki , bilemedin ki , "+tutulanSayi);
    }
}
