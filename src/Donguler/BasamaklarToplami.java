package Donguler;

import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print("Sayının basamaklar toplamı: " + sum);
    }
}
