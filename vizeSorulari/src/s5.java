import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayı kadar adını ekrana yazdıran programı yazınız!
        String ad = "Akif";

        Scanner read = new Scanner(System.in);
        System.out.print("Adınızı kaç kere yazdırmak istiyorsunuz: ");
        int sayi = read.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i + ". Kere :" + ad);
        }
    }
}
