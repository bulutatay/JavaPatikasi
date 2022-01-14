package Metotlar;

import java.util.Scanner;

public class UsAlma {

    static int usalma(int a, int b) {
        int sum = 1;
        for (int i = 1; i <= b; i++) {
            sum *= a;
        }
        System.out.print("Sonuç: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        usalma(taban, us);
    }
}
