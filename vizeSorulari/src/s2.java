public class s2 {
    public static void main(String[] args) {
        // 200 + 1/3 +2/7 + 3/11 ... 30.elemanını ve ilk 50 elemanı yazdıran programı ayzınız!

        double toplam= 200,payda=3;

        for  (int i = 1; i<50; i++){
            double istenilen = i /payda;
            payda +=4;
            if (i== 29) System.out.println("30. eleman = " + istenilen);
            toplam = toplam+ istenilen;
        }
        System.out.println("Toplam = " + toplam);
    }
}

