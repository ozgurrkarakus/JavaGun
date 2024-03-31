package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        String bagis1="700"; // string, kelime
        String bagis2="500"; // string, kelime

        System.out.println(bagis1+bagis2); // 700500

        // ben bunları sayı olarak toplamak istiyorum
        // o zaman String -> int çevirmek gerekir.
        int rakamBagis1= Integer.parseInt(bagis1);  // Double.parseDouble
        int rakamBagis2= Integer.parseInt(bagis2);  // Parse : düzenleyip, dönüştürmek demektir
        int toplamBagis=rakamBagis1+rakamBagis2;

        System.out.println(rakamBagis1+rakamBagis2);
    }
}
