package KosulIfadeleri;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, tip;
        double km, sum, sonuc = 0, ekstra;

        System.out.print("Mesafeyi KM cinsinden yazınız: ");
        km = input.nextDouble();
        System.out.print("Yaşınız: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();

        sum = km * 0.10;

        if ((km > 0) && (age >= 0) && (tip == 1 || tip == 2)) {
            if (age < 12) {
                sonuc += sum * 0.50;
            } else if (age > 12 && age <= 24) {
                sonuc += sum * 0.90;
            } else if (age > 65) {
                sonuc += sum * 0.70;
            } else {
                sonuc += sum;
            }

            if (tip == 2) {
                ekstra = sonuc * 0.80;
                System.out.print("Toplam Tutar: " + ekstra);
            } else {
                System.out.print("Toplam Tutar: " + sonuc);
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz! Lütfen Tekrar Deneyiniz.");
        }
    }
}
