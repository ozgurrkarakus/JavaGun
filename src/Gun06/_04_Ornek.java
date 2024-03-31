package Gun06;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıya öğrenci misiniz şeklinde sorunuz.
        // Evet ise True, değil ise False cevabını veriniz,
        // ve alınan cevabı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrenci misiniz ? =");
        boolean cevap=oku.nextBoolean(); // True,true veya False,false

        System.out.println("cevap = " + cevap);
    }
}
