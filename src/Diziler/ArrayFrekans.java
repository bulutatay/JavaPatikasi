package Diziler;

import java.util.Arrays;

public class ArrayFrekans {

    public static void countFreq(int list[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        System.out.print("Dizi : ");
        for (int k : list) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (list[i] == list[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(list[i] + " Sayısı " + count + " Kere Tekrar Edildi.");
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = list.length;
        countFreq(list, n);
    }
}
