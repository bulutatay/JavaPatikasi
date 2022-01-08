package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, sum = 1;

        System.out.print("Üslü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            sum *= n;
        }
        System.out.println("Cevap: " + sum);
    }
}
