package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // kişinin kilosunu(kg) ve boyunu(m) kendiniz veriniz.
        // kilo ve boy küsüratlı mesala 65.4 kilo, 1.65 m gibi
        // ekrana kilonuz : ....  ve boyunuz= .... yazdıktan sonra
        // vücut kitle indeksini bulunuz : kilo / (boy*boy)

        double kilo = 65.4;
        double boy = 1.65;

        double kitleIndexi = kilo / (boy * boy);

        System.out.println("kilonuz=" + kilo + " boyunuz=" + boy);
        System.out.println("vücut kitle indeksiniz=" + kitleIndexi);
    }
}
