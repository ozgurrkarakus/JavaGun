package Gun20;

public class _03_JavaMethod {

    public static void main(String[] args) {
         merhabaYaz();  // veri almayan, veri döndürmeyen
         merhabaYaz();

         merhabaYazIsme("ismet"); //veri alıyor, veri döndürmüyor
         merhabaYazCok(5);//veri alıyor, veri döndürmüyor
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String ad){
        System.out.println("Merhaba "+ad);
    }

    public static void merhabaYazCok(int miktar){ // başla
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");
        }
    }//dur

}
