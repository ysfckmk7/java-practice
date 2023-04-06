package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        Kullanıcının ıstedıgı buyuklukte dızıye 0-100 arası rstgele sayılarla doldurup kacının ortalamanın altında,
        kacının ortalamanın uzerınde oldugunu bulan metodu bulunuz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu gırınız: ");
        int uzunluk=scan.nextInt();

        arrayolustur(uzunluk);




    }

    private static void arrayolustur(int uzunluk) {

        int[] arr=new int[uzunluk];
        Random rand=new Random();
        int toplam=0;
        for (int i =0; i <arr.length ; i++) {

            arr[i]= rand.nextInt(100);
            toplam+=arr[i];
        }
        double ortalama=toplam/arr.length;
        int alt=0,ust=0,esıt=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<ortalama){
                alt++;

            } else if (arr[i]>ortalama) {
                ust++;
            }else{
                esıt++;
            }
        }
        System.out.println("Rastlege Sayilara: " + Arrays.toString(arr));
        System.out.println("Ortalama: " +ortalama+"\n"+alt+" adet sayı ortaladan kucuk\n"+
                     esıt+" adet sayı ortalaya esıt\n"+ust+" adet sayı ortaladan buyuk\n");
    }
}
