import java.util.Scanner;

public class s1 {
    //2 sayı arasında ki 1 basamaklı 2 basamklı ve üç basamaklı toplamlarını ayrı ayrı bulan program.
    public static void main(String[] args) {

        //soru1
        int tToplam = 0, cToplam = 0, ucToplam = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = read.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = read.nextInt();
        int yedek;
        if (sayi1 < 0) sayi1 = sayi1 * -1;
        if (sayi2 < 0) sayi2 = sayi2 * -1;

        if (sayi1 > sayi2) {
            yedek = sayi1;
            sayi1 = sayi2;
            sayi2 = yedek;
        }

        for (int i = sayi1; i < sayi2; i++) {
            if (i > 0 && i < 10) tToplam += i;
            if (i > 10 && i < 100) cToplam += i;
            if (i > 100 && i < 1000) ucToplam += i;
        }
        System.out.println("Bir basamaklı sayıların toplamı: " + tToplam + ", İki basamaklı sayıların toplamı: "
                + cToplam + ", Üç basamklı sayıların toplamı: " + ucToplam);
    }
}