package day06;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından gırılen string ifadenin icindeki sayısal degerleri toplayan metodu yazınız
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cumle gırınız: ");
        String cumle=scan.nextLine();


        System.out.println(sayısalıfadelerıtopla(cumle));


    }

    public static int sayısalıfadelerıtopla(String cumle) {

        int toplam=0;
        String cumleArr[]=cumle.split("");

       /* for (String each:cumleArr
             ) {

            if (Character.isDigit(each.charAt(0))){
                toplam+=Integer.valueOf(each);
            }
        }

        */
        for (int i =0; i <cumleArr.length ; i++) {


            if (Character.isDigit(cumleArr[i].charAt(0))){

                toplam+=Integer.valueOf(cumleArr[i]);
            }
        }


   return toplam;
    }
}
