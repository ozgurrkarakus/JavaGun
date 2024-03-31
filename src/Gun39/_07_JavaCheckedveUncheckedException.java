package Gun39;

public class _07_JavaCheckedveUncheckedException {  //throws InterruptedException

    public static void main(String[] args)  {

        String kelime="";

        try {
            char ilkHarf = kelime.charAt(0);
            // sen bilirsin ister try catch e al, ister alma :  UnChecked Exception
        }
        catch(Exception ex){
            System.out.println("hata oluştu");
        }

        try {
            Thread.sleep(1000); //Java nın zorunlu try catch tuttuğu kodlara Checked Exception
        } catch (InterruptedException e) {
            System.out.println("hata oluştu");
        }

    }
}
