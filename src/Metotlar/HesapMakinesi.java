package Metotlar;

import java.util.Scanner;

public class HesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama işlemi: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma işlemi: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma işlemi: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bölme işleminde ikinci sayı sıfır olamaz!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme işlemi: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma işlemi: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod işlemi: " + result);
        return result;
    }

    static void alan(int a, int b) {
        System.out.println("Üçgenin alanı: " + (a * b));
        System.out.println("Üçgenin çevresi: " + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Çıkış\n";

        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 8)
                break;
            else if (select >= 1 && select <= 9) {
                System.out.print("1. Sayıyı Giriniz: ");
                int a = input.nextInt();
                System.out.print("2. Sayıyı Giriniz: ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        divided(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 6:
                        mod(a, b);
                        break;
                    case 7:
                        alan(a, b);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Yanlış bir seçim yaptınız.");
                }
            }
            else {
                System.out.println("Yanlış bir seçim yaptınız.");
            }
        }
        System.out.print("Hoşça Kalın.");
    }
}
