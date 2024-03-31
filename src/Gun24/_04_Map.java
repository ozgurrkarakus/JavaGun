package Gun24;

import java.util.HashMap;

public class _04_Map {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız
        // isim, email, telefonu, adres

        HashMap<String, String> ZKartVizit=new HashMap<>();
        ZKartVizit.put("isim","Zehra");
        ZKartVizit.put("email","Zehra@gmail.com");
        ZKartVizit.put("telefon","0505676767");
        ZKartVizit.put("adres","Çekmeköy");

        System.out.println("ZKartVizit.get(isim) = " + ZKartVizit.get("isim"));
        System.out.println("ZKartVizit.get(email) = " + ZKartVizit.get("email"));

        HashMap<String, String> EKartVizit=new HashMap<>();
        EKartVizit.put("isim","Esma");
        EKartVizit.put("email","esma@gmail.com");
        EKartVizit.put("telefon","0506878787");
        EKartVizit.put("adres","Başakşehir");

        System.out.println("EKartVizit.get(isim) = " + EKartVizit.get("isim"));
        System.out.println("EKartVizit.get(email) = " + EKartVizit.get("email"));

        HashMap< String , HashMap<String, String> >  kartvizitler=new HashMap<>();
        kartvizitler.put("Zehra", ZKartVizit);
        kartvizitler.put("Esma", EKartVizit);

        System.out.println("Zehra nın emaili = " + kartvizitler.get("Zehra").get("email"));
        System.out.println("Zehra nın telefonu = " + kartvizitler.get("Zehra").get("telefon"));

        System.out.println("Esma nın emaili = " + kartvizitler.get("Esma").get("email"));
        System.out.println("Esma nın telefonu = " + kartvizitler.get("Esma").get("telefon"));
    }
}
