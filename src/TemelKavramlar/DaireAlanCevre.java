package TemelKavramlar;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, a, alan, cevre, pi = 3.14, dilim;

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        a = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilim = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + dilim);
    }
}
