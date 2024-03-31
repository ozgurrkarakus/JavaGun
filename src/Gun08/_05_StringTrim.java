package Gun08;

public class _05_StringTrim {
    public static void main(String[] args) {
        // trim()  : stringin başındaki ve sonudaki gereksiz boşlukları siler

        String text = "    İsmet temur   ";

        System.out.println("text = ->" + text + "<-");
        System.out.println("text = ->" + text.trim() + "<-");
    }
}
