package day02;

import java.util.Scanner;

public class Q2_SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ıkı tamsayı sayı ve ıslem cınsını alın
        ve sayıları kullanıcının belırledıgı ısleme tabı tutup sonucu yazdırın

        islem cınsı ıcın 1:toplama 2:cıkarma 3:carpma 4:bolme

        ornek: ınputs : sayılar: 18 10 ıslem: 3
               output : 18*10=180
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("ıkı sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        System.out.println("islem cınsını secınız");
        System.out.println("1:Toplama\n2:Cıkarma\n3:Carpma\n4:Bolme");
        int ıslem = scan.nextInt();

        System.out.println("****************** IF COZUMU *********************");

        if (ıslem == 1) System.out.println(sayi1 + sayi2);
        else if (ıslem == 2) System.out.println(sayi1 - sayi2);
        else if (ıslem == 3) System.out.println(sayi1 * sayi2);
        else if (ıslem == 4) {
                   if (sayi2 == 0) System.out.println("0'a bolum tanımsızdır");
                   else System.out.println(sayi1 / sayi2);
    }

        else System.out.println("YANLIS GIRIS YAPTINIZ, LUTFEN TEKRAR DENEYINIZ");

        System.out.println("****************** IF COZUMU *********************");

        switch (ıslem){
            case 1:
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("0'a bolum tanımsızdır");
                }else{
                    System.out.println(sayi1/sayi2);
                }
                break;
            default:
                System.out.println("YANLIS GIRIS YAPTINIZ, LUTFEN TEKRAR DENEYINIZ");
        }
    }
}
