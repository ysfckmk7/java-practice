package day06;

public class Q04 {
    public static void main(String[] args) {
        /*
        Sring'lerden olusan bır arrayde ogeler 'n' veya 'k' ile bıtıyorsa, o ogelerın bas harflerını ekrana yazdıran methodu yazınız
        Ornek: {"Kemal", "Jonathan","Mark","Jackson","Ali"} ==> Cıktı JMJ
         */

        String[] arr={"Kemal", "Jonathan","Mark","Jackson","Ali"};


        basharflerıyazdır(arr);


    }

    private static void basharflerıyazdır(String[] arr) {

        for (int i = 0; i <arr.length ; i++) {

          if (arr[i].endsWith("n")||arr[i].endsWith("k")){

              System.out.print(arr[i].charAt(0)+" ");
          }


        }

    }
}
