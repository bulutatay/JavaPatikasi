package Metotlar;

import java.util.Scanner;

public class Desen {

    static void method(int n, int temp, boolean mode) {
        System.out.print(" " + temp);
        if (temp <= 0) {
            mode = false;
        }
        int next = mode ? temp - 5 : temp + 5;
        if (next <= n) {
            method(n, next, mode);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı giriniz: ");
        int n = input.nextInt();
        method(n, n, true);
    }
}
