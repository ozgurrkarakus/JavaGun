package Gun28._02_Consructor;

public class Kitapci {
    public static void main(String[] args) {
        Book kitap1=new Book();
        kitap1.name="Harry Poter";
        kitap1.publishYear=1997;
        kitap1.author="JK Rowling";

        Book kitap2=new Book("yüzükler",1954,"JRR Tolkien");

        Book kitap3=new Book("çay ve kuru üzüm");

        kitap1.kitapYazdir();
        kitap2.kitapYazdir();
        kitap3.kitapYazdir();
    }
}
