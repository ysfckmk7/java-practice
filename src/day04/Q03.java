package day04;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        
        /*
        Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfıne gelirse
        donguden cıkılsın

        Bugun hava oldukca guzel.--> 2
         */


        String cumle=" Bugun hava oldukca guzel.";
        int sayac=0;

        for (int i =0; i <cumle.length() ; i++) {

            if (cumle.charAt(i)=='a'){
                sayac++;
            }
            if (cumle.charAt(i)=='c'){
                break;
            }
        }

        System.out.println(cumle+"-->" + sayac);







    }
}
