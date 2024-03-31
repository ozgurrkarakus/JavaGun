package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class _06_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] dizi=new Integer[10];

        for (int i = 0; i < dizi.length; i++)
            dizi[i]= (int)(Math.random()*11);

        System.out.println("dizi = " + Arrays.toString(dizi));

        //1.Yöntem
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < dizi.length; i++)
              ts.add( dizi[i] ) ;

        System.out.println("ts = " + ts);

        //2.Yöntem
        TreeSet<Integer> ts2=new TreeSet<>( Arrays.asList(dizi) );
        System.out.println("ts2 = " + ts2);

        //3.Yöntem
        TreeSet<Integer> ts3=new TreeSet<>();
        ts3.addAll( Arrays.asList(dizi) );
        System.out.println("ts3 = " + ts3);

        //4.Yöntem
        TreeSet<Integer> ts4=new TreeSet<>();
        Collections.addAll(ts4, dizi);
        System.out.println("ts4 = " + ts4);
    }
}
