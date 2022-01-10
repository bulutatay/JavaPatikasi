package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoş Geldiniz:");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyemiz Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("İyi Günler.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke edilmiştir. Lütfen bankanız ile irtibata geçiniz..");
                } else {
                    System.out.println("Kullanıcı adı veya şifre hatalı. Lütfen tekrar deneyiniz!");
                    System.out.println("Kalan giriş denemesi hakkınız: " + right);
                }
            }
        }
    }
}
