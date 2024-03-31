package Gun35._05_Interface;

public class A7 implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yaz(String msg) {
        System.out.println("msg = " + msg);
    }

    @Override
    public void yaz() {
        System.out.println("yazdırdı");
    }
}
