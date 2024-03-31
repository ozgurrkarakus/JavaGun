package Gun34._05_Polymorphism;

import java.util.*;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
        kopek1.ses(); // havladı
        kopek1.kokladi(); // kokladi

        Kedi kedi1=new Kedi("köpük");
        kedi1.ses(); // miyavladı
        kedi1.tirmaladi(); // tırmaladı

        kopekSesi(kopek1);
        kediSesi(kedi1);

        System.out.println("-------------------");
        hayvanSesi(kopek1); //
        hayvanSesi(kedi1); //
        // hem kendi türünde hem de extend olduğu tür
        // de de olabilmesine çok biçimlilik yani
        // Polymorphism denir

//        HashMap<String,String> m1=new HashMap();
//        ArrayList<String> l1=new ArrayList<>();
//
//        Map<String,String> m2=new HashMap<>();
//        Map<String,String> m3=new TreeMap<>();
//        Map<String,String> m4=new LinkedHashMap<>();
//        List<String> l2=new ArrayList<>();

        //Referans tipi   //Nesne Tip
        Hayvan hay1=new Hayvan("kurbağa");
        Hayvan kopek2=new Kopek("kangal");
        Hayvan kedi2=new Kedi("boncuk");

        System.out.println("**********************");
        hay1.ses(); // ses çıkardı
        kopek2.ses(); //hayvan kılığında köpek, havladı
        kedi2.ses(); // hayvan kılığında kedi , miyavladı

        ((Kopek)kopek2).kokladi(); // sen aslında köpeksin
        ((Kedi)kedi2).tirmaladi(); // sen aslında bir kedisin
    }

    public static void hayvanSesi(Hayvan h){
        // h nini tipi alsan kendi tipi olacak
        h.ses(); // herkes kendi sesini çıkarır

        // burada gelenin köpek mi, kedi mi olduğunu nasıl anlarım
        if (h instanceof Kopek) //h aslında köpek ise
            ((Kopek)h).kokladi();

        if (h instanceof Kedi)  // h slınd akedi ise
            ((Kedi)h).tirmaladi();
    }


    public static void kopekSesi(Kopek kp){
        kp.ses(); // havadı
    }

    public static void kediSesi(Kedi kd){
        kd.ses(); // miyavladı
    }
}
