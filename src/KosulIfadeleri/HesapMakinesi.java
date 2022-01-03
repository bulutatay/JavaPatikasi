package KosulIfadeleri;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("1. Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlem Numarasını Giriniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölme: " + (n1 / n2));
                }else{
                    System.out.print("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.print("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz!");
        }
    }
}
