package Gun06;

import java.util.Scanner;

public class _02_OrnekDouble {
    public static void main(String[] args) {
        Scanner  oku= new Scanner(System.in);

        System.out.print("Kilonuzu giriniz=");
        double kilo=oku.nextDouble(); // virgul le mi yazacağız, nokta ile mi ?

        System.out.println("kilo = " + kilo);
    }
}
