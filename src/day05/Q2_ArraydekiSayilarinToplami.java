package day05;

public class Q2_ArraydekiSayilarinToplami {
    public static void main(String[] args) {
        /*
        Create an array of 5 floats and calculate their sum.
         */


        // float[] numbers=new float[5];


        System.out.println("++++++++++++ FOR LOOP cozumu ++++++++++++++++");

        float[] nubers={1.1f,2.0f,3.2f,5.0f,7.5f};

        float toplam=0;

        for (int i =0; i <=nubers.length-1 ; i++) {

            toplam+=nubers[i];
        }

        System.out.println("Toplam : " + toplam);

        System.out.println("++++++++++++ WHİLE LOOP cozumu ++++++++++++++++");

        toplam =0;
        int index=0;

        while (index<nubers.length){

           toplam+=nubers[index];
           index++;

        }
        System.out.println("yeni toplam :" + toplam);


        System.out.println("++++++++++++ WHİLE LOOP 2 cozumu ++++++++++++++++");

        // nubers={1.1f,2.0f,3.2f,5.0f,7.5f};
        toplam=0;

        int ind=nubers.length-1;

        while (ind>=0){

            toplam+=nubers[ind];
            ind--;

        }

        System.out.println("Son toplam : " + toplam);
    }
}
