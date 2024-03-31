package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle giriniz= ");
        String cumle=oku.nextLine();

        // 1.Yöntem
        boolean varMi= cumle.contains("a");

        if (varMi == true)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");

        //2.Yöntem
        if (cumle.contains("a") == true)
            System.out.println("EVET");

        if (cumle.contains("a") == false)
            System.out.println("HAYIR");

        //3.Yöntem
        boolean varMi2= cumle.contains("a");

        if (varMi2)     // varMi==true  varMi
            System.out.println("EVET");

        if (!varMi2)
            System.out.println("HAYIR");


        //4.Yöntem
        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a"))
            System.out.println("HAYIR");

    }
}






