package Gun29._04_Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void paraYatir(int yatanPara){
        this.yatan = this.yatan+yatanPara;
        this.bakiye =this.bakiye+yatanPara;
    }

    public void paraCek(int cekilenPara){
        this.cekilen = this.cekilen+cekilenPara;
        this.bakiye =this.bakiye-cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
