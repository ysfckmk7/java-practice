package day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {

    public static void main(String[] args) {
        // Kullanıcıdan bolunen ve bolen seklınde 2 sayı alalım ve bolme operatoru
        // kullanmadan bolme ıslemını gerceklestırıp bolumu hesaplayan method create edınız


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek ıstedıgınız sayısıyı gırınız");
        int bolunen=scan.nextInt();
        System.out.println("Lutfen bolen sayıyı gırınız");
        int bolen=scan.nextInt();


        System.out.println(bolunen + "/" + bolen + "=" + bolumhesabi(bolunen, bolen));
        System.out.println(bolumhesabi(25,5));
        System.out.println(bolumhesabi(32,4));
        System.out.println(bolumhesabi(96,3));
        System.out.println(bolumhesabi(100,33));
    }

    public static int bolumhesabi(int bolunen,int bolen) {

        int bolum=0;

      while (bolunen>=bolen){

          bolunen-=bolen;
          bolum++;
      }

        return bolum;

    }
}
