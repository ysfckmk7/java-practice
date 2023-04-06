package day04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Bir sayının mukemmel olup olmadıgını bulan bır method yazınız
        Mukemmel Sayı: bır sayının kendısı harıc bolenlerının toplamı
        kendısıne esıtse o sayı mukemmeldır
        ORNEK:
        INPUT: 6
        OUTPUT:1,2,3
        1+2+3=6
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        if (MUKEMMELSAYI(sayi)){
            System.out.println(sayi +" sayisi mukemmel bır sayıdır");
        }else{
            System.out.println(sayi +" sayisi mukemmel bır sayı degildir");
        }

    }

    public static boolean MUKEMMELSAYI(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            return true;
        } else
            return false;
        }
    }