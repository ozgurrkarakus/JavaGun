package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana tekrar yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı giriniz=");
        String ad=oku.next();  // next() bir kelime okur

        System.out.println("ad = " + ad);
        /*
            oku.next();      -> bir kelime okur
            oku.nextLine();  -> satırın tümünü okur

            oku.nextInt();   -> bir tam sayı okur
            oku.nextShort(); -> bir short tam sayı okur
            oku.nextByte();  -> bir byte tam sayı okur
            oku.nextLong();  -> bir long tam sayı okur

            oku.nextFloat(); -> bir kusuratlı sayı okur
            oku.nextDouble();-> bir kusratlı uzun sayı okur

            oku.nextBoolean();-> bir boolean değer okur (true/false)
         */
    }
}
