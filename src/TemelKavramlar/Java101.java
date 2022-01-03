package TemelKavramlar;

import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ad;
        String soyad;

        System.out.print("Adınız: ");
        ad = input.nextLine();

        System.out.print("Soyadınız: ");
        soyad = input.nextLine();

        System.out.print(ad + " " + soyad);
    }
}
