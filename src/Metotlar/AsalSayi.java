package Metotlar;

import java.util.Scanner;

public class AsalSayi {

    static int asal(int a) {
        int sayac = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(a + " Asal bir sayidir.");
        } else {
            System.out.println(a + " Asal bir sayi degildir.");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        asal(input.nextInt());
    }

}
