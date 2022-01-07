package Donguler;

import java.util.Scanner;

public class TekSayilarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, sum = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            i = input.nextInt();
            if (i % 4 == 0) {
                sum += i;
            }
        } while (i % 2 == 0);

        System.out.print(sum);

        //System.out.print("Program Sonlandırıldı..");
    }
}
