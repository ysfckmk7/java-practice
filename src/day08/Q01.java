package day08;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        /*
        Verilen bir array'in elemanlarinin ardisik toplamini hesaplayan metodu yazınız
        input :{3,5,1,2,7,9,2,3,5,7}
        output :{3,5+1,2+7+9,2+3+5+7}
                {3, 6,   18,    17}
         */


        ardisiktoplam();

    }

    public static void ardisiktoplam() {

        int[] arr={3,5,1,2,7,9,2,3,5,7};
        int[] toplamarr=new int[4];
        for (int i =0; i <toplamarr.length ; i++) {

            toplamarr[0]=arr[0];
            toplamarr[1]=arr[1]+arr[2];
            toplamarr[2]=arr[3]+arr[4]+arr[5];
            toplamarr[3]=arr[6]+arr[7]+arr[8]+arr[9];
        }
        System.out.println(Arrays.toString(toplamarr));

    }
}