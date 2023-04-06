package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Girilen desimal degeri binary degere cevıren metodu olusturunuz
        // Ornek: 12 = 1 1 0 0

        Scanner scan=new Scanner(System.in);
        System.out.println("Binary ifadeye cevirilecek desimal degeri giriniz: ");
        int desimalSayi=scan.nextInt();

        System.out.println(desimalSayi+" sayısının binary karsılıgı: "+binaryCevir(desimalSayi));


    }

    private static ArrayList binaryCevir(int desimalSayi) {
        ArrayList<Integer> binary=new ArrayList<>();
        while (desimalSayi>=1){
            binary.add(desimalSayi%2);// 1,1,0
            desimalSayi/=2;
        }
        // Collections.reverse(binary);
        ArrayList<Integer> binaryTers=new ArrayList<>();
        for (int i =binary.size()-1; i >=0 ; i--) {
            binaryTers.add(binary.get(i));
        }
         return binaryTers;// 1,1,0
    }
}
