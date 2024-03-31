package Gun30._02_FinaVariables.Ornek2;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("ismet","Çekmeköy");
        Vatandas v2=new Vatandas("ayşe","Şişli");
        Vatandas v3=new Vatandas("Çilem","Bakırköy");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.TCNo=45; final değişkenlere sadece
        // tanımlanırken veya Constructor da değer atanabilir.
        
    }
}
