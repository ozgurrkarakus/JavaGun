package Gun07;

public class _09_StringSubstring {
    public static void main(String[] args) {
        // Substring  : string den parça alır
        //         012345678901234567
        String s1="Merhaba Java yı sevenler derneği üyeleri";

        String parca1= s1.substring(3,9); // 3 den başla 9 a kadar al
        // 3 parametrede index, 3 den 9 a kadar al, 9 dahil değil
        System.out.println("parca1 = " + parca1); // haba J

        System.out.println("s1.substring(8,15) = " + s1.substring(8,15));
        // Java yı

        System.out.println("s1.substring(8) = " + s1.substring(8));
        // verilneden SONA kadar parçayı alır
    }
}
