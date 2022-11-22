import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        //ali -def ---->  adleif yapan program yazınız.

        Scanner read = new Scanner(System.in);

        System.out.println("1.kelime girin: ");
        String str1 = read.nextLine();

        System.out.println("2.kelime girin: ");
        String str2 = read.nextLine();
        String sonuc = "";
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char harf1 = str1.charAt(i);
                char harf2 = str2.charAt(i);
                String harf3 = String.valueOf(harf1);
                String harf4 = String.valueOf(harf2);

                sonuc += harf3 + harf4;
            }
            System.out.println("Sonuc string: " + sonuc);
        }
    }
}