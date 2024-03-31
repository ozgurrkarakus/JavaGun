package Gun26._04_Ornek;

public class Rectangle {
    int width;
    int length;

    void Alan(){ // hesapla yaz
        System.out.println("Alan="+
                (this.width*this.length) );
    }

    void Cevre(){
        System.out.println("Cevre="+
                (this.width+this.length)*2 );
    }

    int Alan2(){ //hesapla geri gönder
        return (this.width*this.length);
    }

    void degerAta(int width, int length){
        this.width=width;
        this.length=length;
    }

}
