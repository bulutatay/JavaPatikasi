package Diziler;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;
        int min = number;
        int max = number;

        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (number < list[i]) {
                min = list[i - 1];
                max = list[i];
                break;
            }
        }

        System.out.println("Girilen Sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
