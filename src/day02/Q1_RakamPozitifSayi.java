package day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    //Kullanıcıdan bir sayi aliniz.
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekranda "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdirini.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=scan.nextInt();


        System.out.println("**************** IF Cozumu ******************");

        if (sayi>=0){

            if (sayi<10){
                System.out.println("Girdiginiz rakamdir");
            }else{
                System.out.println("Girdiginiz sayi Pozitif Sayidir");
            }


        }else{
            System.out.println("Girdiginiz Sayi Negatif Bir Sayidir" );
        }

        System.out.println("**************** Ternary Cozumu ******************");

        String result=((sayi>=0) ?((sayi<10)) ?("Rakamdir") :  ("Pozitif Sayidir") : ("Negatif Sayi"));
        System.out.println(result);

    }
}
