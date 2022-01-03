package TemelKavramlar;

import java.util.Scanner;

public class DikUcgenHipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, cevre, alan, islem;

        System.out.print("Üçgenin 1. Kenar Uzunluğu: ");
        a = input.nextDouble();

        System.out.print("Üçgenin 2. Kenar Uzunluğu: ");
        b = input.nextDouble();

        System.out.print("Üçgenin 3. Kenar Uzunluğu: ");
        c = input.nextDouble();

        islem = (a+b+c)/2;
        cevre = 2*islem;
        alan = Math.sqrt(islem * (islem - a) * (islem - b) * (islem - c));

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
