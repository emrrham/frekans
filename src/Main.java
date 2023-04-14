import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        //Dizi : [10, 20, 20, 10, 10, 20, 5, 20] Tekrar Sayıları 10 sayısı 3 kere tekrar edildi. 20 sayısı 4 kere tekrar edildi. 5 sayısı 1 kere tekrar edildi.
        int[] dizi = { 1,2,4,41,2,16,16,12,16,28};

        int sayi = 4;
        int sayma = 0;
        for (int i = 0 ;i<dizi.length;i++){
            if (dizi[i] == sayi){
                sayma++;
            }
        }
        System.out.println(sayi+ " sayımız "+ sayma + " tekrar edildi. ");
    }
}