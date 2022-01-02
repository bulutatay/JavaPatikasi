import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double deger, fiyat, kdv, miktar;

        System.out.print("Ürün Fiyatını Yazınız: ");
        deger = input.nextDouble();

        miktar = deger<1000 ? (deger*0.18) : (deger*0.08);

        kdv = miktar;
        fiyat = deger + kdv;

        System.out.println("KDV'siz Fiyat: " + deger);
        System.out.println("KDV Tutarı: " + kdv);
        System.out.println("KDV'li Fiyat: " + fiyat);

    }
}
