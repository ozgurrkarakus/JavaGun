package Gun30._02_FinaVariables.Ornek1;

public class Student {
    final int id;   // final değişkenlere , ya tanımlandığında yada constructor da
                    // değer atanabilir ve sonra değiştirelemez
    String fullName;

    private static int sayac=1; // sadece class ın içinde erişilebilir

    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        //this.id=56;  // daha sonradan değer atanamasın değiştirilemesin

        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }



}
