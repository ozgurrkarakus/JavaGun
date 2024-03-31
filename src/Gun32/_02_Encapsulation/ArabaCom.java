package Gun32._02_Encapsulation;

public class ArabaCom {
    public static void main(String[] args) {
        Araba a1=new Araba();
        a1.setModel(2024);
        a1.setRenk("Kırmızı");
        a1.setMotorHacmi(1400);
        a1.setKapiSayisi(9);

        System.out.println("a1 = " + a1);

        System.out.println("renk = " + a1.getRenk());
        System.out.println("getModel = " + a1.getModel());
        System.out.println("getMotorHacmi = " + a1.getMotorHacmi());
        System.out.println("getKapiSayisi = " + a1.getKapiSayisi());

        Araba a2=new Araba("siyah",2023, 1500, 9);
        System.out.println("a2 = " + a2);


    }
}
