package Gun29._02_PrivateErisim;

public class Calisan {
    int id; // default:sadece aynı paket erişimi
    String name;// default
    String surname;// default
    private String password;// default

    public void sifreAta(String sifre){
        if (sifre.length() >= 8)
            this.password=sifre;
        else
            System.out.println("zayıf şifre");
    }

    public void sifreGoster(){
        System.out.println("****"+
                this.password.substring(4));
    }

}
