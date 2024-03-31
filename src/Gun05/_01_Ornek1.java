package Gun05;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class _01_Ornek1 {
    public static void main(String[] args) {
        String ad="İsmet Temur";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi=true;

        System.out.println(ad+" "+sinifNo+" "+subesi+" "+gectiMi);
        // birleştirmeye soldan sağa doğru giderim.
        // solda string varsa yanındaki otomatik stringe dönüştürürüm yani eklerim

        System.out.println("merhaba"+1+2); // merhaba12
        System.out.println(1+2+"merhaba"); // 3merhaba
        // soldan geldiğinden önce 1+2 3 olarak TOPLAMA işlemi yaptı, sonrasında
        // merhaba stringine gelince ona EKLENDİ

        // sayıları Stringe nasıl çeviririz ?
        int sayi=56;
        String strSayi= String.valueOf(sayi); // sayıyı string çevirmiş oldun
    }
}
