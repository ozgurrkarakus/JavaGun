package Gun10;

import java.util.Scanner;

public class _08_MantiksalIfadeler {
    public static void main(String[] args) {
        // mantıksal ifadeler
        // ve     &&
        // veya   ||

        // Soru : girilen bir sayı 0 dan büyük ve 100 den küçük eşit
        // ise geçerli not , değil ise geçerli olmayan not
        Scanner oku=new Scanner(System.in);

        System.out.print("ogrNot=");
        int ogrNot=oku.nextInt();

        if ( 0<ogrNot && ogrNot<=100 )
            System.out.println("Geçerli not");
        else
            System.out.println("Geçerli değil");
    }
}
