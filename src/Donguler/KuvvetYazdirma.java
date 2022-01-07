package Donguler;
import java.util.Scanner;

public class KuvvetYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int grens = input.nextInt();

        for (int i = 1; i <= grens; i*=20){
            System.out.println(i);
        }
    }
}
