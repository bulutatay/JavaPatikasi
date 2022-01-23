import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        int sayac = 5;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            int n = input.nextInt();
            if (n < 0 || n > 100){
                System.out.println("0 ile 100 arasında bir tahminde bulunun !");
                sayac--;
                System.out.println("Kalan hakkınız : " + sayac);
                continue;
            }

            if (n == number) {
                System.out.print("Tebrikler tahmininiz doğru. Tahmin ettiğiniz sayı : " + number);
                break;
            } else {
                sayac--;
                if (sayac == 0) {
                    System.out.println("Oyunu kaybettiniz !");
                    break;
                }
                if (n < number) {
                    System.out.println("Tahmininiz yanlış. " + n + " sayısı gizli sayıdan küçüktür.");
                    System.out.println("Kalan hakkınız : " + sayac);
                } else {
                    System.out.println("Tahmininiz yanlış. " + n + " sayısı gizli sayıdan büyüktür.");
                    System.out.println("Kalan hakkınız : " + sayac);
                }
            }
        }
    }
}
