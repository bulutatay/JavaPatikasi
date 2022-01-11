package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        int ebob = 1, ekok = 1;

        System.out.print("n1 Değerini Giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 Değerini Giriniz: ");
        n2 = input.nextInt();

        if (n2 < n1) {
            n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);

        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK: " + ekok);
    }
}
