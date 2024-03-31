package Gun28._04_Consructor;

public class BDDK {






    public static void main(String[] args) {
        Banka b1=new Banka();
        b1.adi="Ziraat Bankası";
        b1.kurulusYili=1876;
        b1.subeSayisi=1500;

        Banka b2=new Banka("Garanti");
        Banka b3=new Banka("Akbank",1980,600);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
