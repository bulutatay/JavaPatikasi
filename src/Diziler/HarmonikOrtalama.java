package Diziler;

public class HarmonikOrtalama {
    public static void main(String[] args) {

        int[] number = {3, 5, 6, 7, 9, 12, 14};
        double sum = 1.0;

        for (int i = 0; i < number.length; i++) {
            sum += (1.0 / number[i]);
        }

        System.out.println(number.length / sum);
    }
}
