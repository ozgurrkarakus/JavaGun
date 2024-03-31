package Gun26._03_Ornek;

public class Company {
    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Zehra";
        cal1.surName="Gül";
        cal1.age=18;

        Person cal2=new Person();
        cal2.name="Ayçin";
        cal2.surName="Kapar";
        cal2.age=19;

        System.out.println("1.Yöntem");
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surName = " + cal2.surName);
        System.out.println("cal2.age = " + cal2.age);

        System.out.println();
        System.out.println("2.Yöntem");
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        System.out.println();
        System.out.println("3.Yöntem");
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        cal1.GetBirthYear();
        cal2.GetBirthYear();

    }

    public static void BilgiYazdir(Person cal){
        System.out.println("name = " + cal.name);
        System.out.println("surName = " + cal.surName);
        System.out.println("age = " + cal.age);
    }



}
