package day04;

public class Q02 {

    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin, sayi ve harf degerını konsola yazdırınız


        for (char i =0; i <=255; i++) {

            System.out.println(i + " = " + (int) i);


        }
        for (int i =0; i <=255 ; i++) {

            System.out.println((char) i +"="+ i );
        }

    }}
