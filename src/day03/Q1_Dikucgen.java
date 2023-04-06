package day03;

import java.util.Scanner;

public class Q1_Dikucgen {
    public static void main(String[] args) {
        /*
              Kullanıcıdan uc adet sayi alarak sayıların
              bır dık ucgenın kenar uzunlukları olup olmadıgını hesaplatan bır kod yazınız
              NOT:
              Bır ucgenın dık oldugunu anlamak ıcın a2+b2=c2 pısagor
              denklemınden yararlanabılırsınız
              ----- ornek ekran cıktısı -----
              ilk kenarı gırınız:2
              ıkıncı kenarı gırınız:15
              ucuncu kenarı gırınız:7
              Bu bır dık ucgen degıldır
              Bu bır dık ucgendır
         */


        Scanner scan =new Scanner(System.in);
        System.out.print("ilk kenari giriniz :");
        int kenar1=scan.nextInt();
        System.out.print("ikıncı kenari giriniz :");
        int kenar2=scan.nextInt();
        System.out.print("ucuncu kenari giriniz :");
        int kenar3=scan.nextInt();


        if (!(kenar1*kenar1+kenar2*kenar2==kenar3*kenar3)){
            System.out.println("Bu bır dık ucgen degıldır");
        }else{
            System.out.println("Bu bır dık ucgendır");
        }

    }
}
