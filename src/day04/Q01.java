package day04;

public class Q01 {
    public static void main(String[] args) {

        /*
        sayaci ritmiik ilerleyen ve adım sayısı bellı ıse For kullanılır
        DEGİLSE While kullanılır, Eger donguye bır kez mutlaka gırılıcekse DO_WHILE kullanılır

        Problem Tanımı
        100'den 0'a kadar 13'e tam bolunebılen sayıları ve toplamlarını ekrana yazdırınız(buyukten kucuge).

        Ekran Cıktısı
        91
        78
        65
        52
        39
        26
        13
         */



        int toplam=0;
        for (int i =100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i+" sayisi 13 e tam bolunur.");
                toplam+=i;
            }

        }

        System.out.println("toplam = " +toplam);

    }
}
