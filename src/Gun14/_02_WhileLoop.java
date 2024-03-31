package Gun14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcının gireceği 6 sayıdan tek olanlarının toplamını bulunuz

       // döngünü içide neler olacak
        // sayı okuma , tekse toplam=toplam+sayi , sayac++
        // döngünü şartı  sayac < 6
        Scanner oku=new Scanner(System.in);
        int sayac=0, toplam=0;

        while (sayac < 6){
            System.out.print("Sayı giriniz=");
            int sayi=oku.nextInt();

            if (sayi%2 == 1) // tekse
                toplam=toplam+sayi;

            sayac=sayac+1; // sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}
