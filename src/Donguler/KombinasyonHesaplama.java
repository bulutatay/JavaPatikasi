package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, nfak = 1, rfak = 1, fark = 1;

        System.out.print("Küme Eleman Sayısını Giriniz: ");
        n = input.nextInt();

        System.out.print("Eleman Seçim Sayısını Giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nfak *= i;
        }
        for (int k = 1; k <= r; k++) {
            rfak *= k;
        }
        for (int m = 1; m <= (n - r); m++) {
            fark *= m;
        }

        System.out.print("Kombinasyon: " + (nfak / (rfak * (fark)))); //n! / (r! * (n-r)!)
    }
}
