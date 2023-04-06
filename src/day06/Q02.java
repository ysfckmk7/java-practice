package day06;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        /*
        Elinizdeki bir miktar farklı boylarda somun ve bu somunlara uyacak cıvatalar olsun.
        Civataları somunlara eslemek ıcın nasıl bır algorıtma yazarsınız
        int somun[]={1,2,3,4,5,6,7,8,9};
        int civata[]={3,6,5,7,79,9,3,1,33};
         */

        int somun[]={1,2,3,4,5,6,7,8,9};

        int civata[]={3,6,5,7,79,9,3,1,33};


        for (int i =0; i <somun.length ; i++) {

            for (int j =0; j <civata.length ; j++) {

                if (somun[i]==civata[j]){
                    System.out.println(somun[i]+" somunu "+civata[j]+" civatasi ile eslesti");
                }
            }
        }


    }
}
