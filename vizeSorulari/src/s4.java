import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        //CIKIS girilene kadar , girilen rastgele stringleri toplayan ve ayzdıran programı yapınız!
        Scanner read = new Scanner(System.in);
        String toplam = "";
        while (true) {
            System.out.println("String giriniz: ");
            String kelime = read.nextLine();

            if (kelime.equals("CIKIS")) break;

            toplam += kelime;
        }
        System.out.println("Toplam = " + toplam);
    }
}
