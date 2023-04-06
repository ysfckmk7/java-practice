package day07;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Q3_KelimeyiHarflerineAyirma {
    public static void main(String[] args) {

        // Parametre olarak String bir isim girdiginiz, size o ismin harflerini
        // bir char Array olarak yazdiran bir method olusturunuz.

        //toCharArray() methodunu kullanmayınız!

        // input : John
        // Output : [j,o,h,n]


        String isim="John";

        kelimeninHarfleriniAyirma(isim);


    }

    private static void kelimeninHarfleriniAyirma(String isim) {

        char[] harfler=new char[isim.length()];

        for (int i =0; i <isim.length(); i++) {

            harfler[i]=isim.charAt(i);
        }
        System.out.println("Kelimenin harflerinin arryay'i : " + Arrays.toString(harfler));
    }
}
