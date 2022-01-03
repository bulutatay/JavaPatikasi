package TemelKavramlar;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe, ucret, sonuc;
        System.out.print("Taksi ile gidilen mesafeyi giriniz (km): ");
        mesafe = input.nextDouble();

        ucret = 10 + (mesafe*2.20);
        sonuc = ucret < 20 ? 20 : ucret;

        System.out.print("Taksi Ücretiniz: " + sonuc + " TL 'dir.");
    }
}
