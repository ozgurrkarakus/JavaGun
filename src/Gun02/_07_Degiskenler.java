package Gun02;

public class _07_Degiskenler {
    public static void main(String[] args) {
         int kenar=5;   // int kenar, cevre;  birden fazla değişken aynı satırda tanımlayabilirim

         int cevre=kenar+kenar+kenar+kenar;

//         int cevre;
//         cevre=kenar+kenar+kenar+kenar

        System.out.println("Tarlanın Çevresi = "+cevre);
        System.out.println("Tarlanın çevresi = "+ (4*kenar) ); // bu şekilde de olabilir
    }
}
// 4 kenarı eşit olan tarlanın, bir kenarı verildiğind eçevresini bulunuz.
/*
1-Başla
2-kenar oku
3-cevre=kenar+kenar+kenar+kenar
4-cevra yaz
5-dur
 */
