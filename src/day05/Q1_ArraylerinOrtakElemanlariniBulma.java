package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_ArraylerinOrtakElemanlariniBulma {
    public static void main(String[] args) {
        /*
        iki array arasında aynı olan elemanları bır liste ekleyen program yazın
        (buyuk kucuk harf onemsız)

        input:{John,Brad,Ange,Sofia,Emily}
        input2:{sofia,brad,grace,emily,hazel}
        output:[sofia,brad,emily]
         */

        String[] arr1={"John","Brad","Ange","Sofia","Emily"};
        String[] arr2={"sofia","brad","grace","emily","hazel"};


        OrtakElmanlar(arr1,arr2);



    }

    public static void OrtakElmanlar(String[] arr1,String[] arr2) {


        ArrayList<String> arrayList=new ArrayList<>();

        for (int i =0; i <arr1.length ; i++) {

            for (int j =0; j <arr2.length ; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){

                    arrayList.add(arr1[i]);

                }


            }

        }

        System.out.println(arrayList);
    }
}
