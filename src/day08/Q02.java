package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan alınan bır tamsayıya kadar FIBONACCI dızısı olusturun
        // 1-1-2-3-5-8-13-21-34...


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayı gırınız");
        int sayi=scan.nextInt();

        ArrayList<Integer> fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        int toplam=0;

        for (int i =2; i <sayi ; i++) {
            toplam=(fibo.get(fibo.size()-2)+(fibo.get(fibo.size()-1)));
            fibo.add(toplam);
        }

        System.out.println(fibo);

    }
}
