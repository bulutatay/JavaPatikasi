package Donguler;

import java.util.Scanner;

public class CiftSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, girilen, adet = 0, toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        girilen = input.nextInt();

        while (i <= girilen) {
            if (i % 3 == 0 && i % 4 == 0) {
                adet++;
                toplam += i;
            }
            i++;
        }
        System.out.print(toplam / adet);
    }
}
