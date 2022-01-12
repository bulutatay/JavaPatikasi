package Donguler;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 il 10 arası bir sayı giriniz: ");
        int n = input.nextInt();

        if (n >= 1 && n <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n*i));
            }
        } else {
            System.out.print("Belirtilen aralığın dışına çıktınız! Tekrar deneyiniz..");
        }
    }
}
