package KosulIfadeleri;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat, fizik, turkce, kimya, muzik, toplam = 0, adet = 0;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextDouble();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            adet++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            adet++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            adet++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            adet++;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            adet++;
        }

        double avarage = (toplam / adet);

        System.out.println("Ortalamanız: " + avarage);

        if (avarage < 55) {
            System.out.println("Sınıfı Geçemediniz!");
        } else {
            System.out.println("Sınıfı Başarı ile geçtiniz.");
        }
    }
}
