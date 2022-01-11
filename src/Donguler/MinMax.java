package Donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=0, min=0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int x = input.nextInt();

            if (i == 1) {
                max = x;
                min = x;
            } else if (x < min) {
                min = x;
            } else if (x > max) {
                max = x;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
