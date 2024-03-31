package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 3 notun ("82","95","56") ortalamasını bulunuz.

        String yaziNot1="95";
        String yaziNot2="82";
        String yaziNot3="56";

        double dNot1= Double.parseDouble(yaziNot1);
        double dNot2= Double.parseDouble(yaziNot2);
        double dNot3= Double.parseDouble(yaziNot3);

        double ort = (dNot1+dNot2+dNot3) /3 ;

        System.out.println("ort = " + ort);
    }
}
