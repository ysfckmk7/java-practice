package day07;

import java.util.Arrays;

public class Q1_Arrays2D {
    public static void main(String[] args) {

        // new char [row][colums]

        char [][] harfler=new char[3][4];

        harfler[0][0]='A';
        harfler[0][1]='B';
        harfler[0][2]='C';
        harfler[0][3]='D';

        System.out.println(Arrays.deepToString(harfler));// [[A, B, C, D], [ ,  ,  ,  ], [ ,  ,  ,  ]]

        // 1. Index ya da dıs katmandakı 2. elemanı
        harfler[1][0]='E';
        harfler[1][1]='F';
        harfler[1][2]='G';
        harfler[1][3]='H';

        System.out.println(Arrays.deepToString(harfler));


        // 2. Index yada dıs katmandakı 3. eleman
        harfler[2][0]='J';
        harfler[2][1]='K';
        harfler[2][2]='L';
        harfler[2][3]='M';

        System.out.println(Arrays.deepToString(harfler));

        // Tum atamaları ındexler uzerınden tek tek gerceklestırebıldıgımız
        // gıbı tek seferde de yapabılırız


        int [][] sayilar ={{10,20,30},{1,2,3},{100,200,300}};

        System.out.println(sayilar[2][1]);// 200


    }
}
