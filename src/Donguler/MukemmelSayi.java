package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }

        if (toplam == n) {
            System.out.print(n + " Mükemmel sayıdır.");
        } else {
            System.out.print(n + " Mükemmel sayı değildir.");
        }
    }
}
