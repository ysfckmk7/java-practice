package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

        /*
        Basit bir 5 urunlu manav alısverıs programı yazınız

        1.Adim : urun listesinden urun sectır ve kac kılo oldugunu sor
        2.Adim : Baska bır urun almak ısteyıp ıstemedıgını sor. ıstemıyorsa toplam mıktarı goster
        ıstıyorsa tekrar urun sectır.Bu ıslemı alısverısı bıtırmek ısteyene kadar tekrarla
        3.Adim : Musterı her urun sectıgınde, aldıgı urunun fıyatını toplam fıyata ekle
        4.Adim : Alısverıs bıtınce toplam odemesı gereken tutarı goster
         */


    static ArrayList<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Elma","Ispanak","Muz"));
    static ArrayList<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,12,15,10,18));
    static double toplam=0;
    static  Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("***** DOYURAN MARKET *****");
        menu();
        
        
    }

    private static void menu() {

        for (int i =0; i <5 ; i++) {
            System.out.println(i+1+ ".urun: "+ urunList.get(i) + "fiyati: " + fiyatList.get(i)+" TL");
        }

        System.out.println("Secmek ıstedıgınız urun kodunu gırınız: ");
        int urun=scan.nextInt();
        System.out.println("Miktar giriniz: ");
        double miktar=scan.nextInt();
        toplam+=miktar*fiyatList.get(urun-1);

        System.out.println("Alısverıse devam etmek ıstıyor musunuz? E/H");
        char secim=scan.next().charAt(0);

        if (secim=='e' || secim=='E'){
            menu();
        }else{
            System.out.println("Odenecek tutar: "+toplam);
        }



    }


}
