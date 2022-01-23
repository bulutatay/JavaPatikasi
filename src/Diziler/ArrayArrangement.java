package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrangement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.println("Dizinin elamanlarını giriniz: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Eleman: ");
            list[i - 1] = input.nextInt();
        }

        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
