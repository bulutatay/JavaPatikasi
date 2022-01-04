package KosulIfadeleri;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, questions, newpassword;

        System.out.print("Kullanıcı Adınız: ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Başarılı..");
        }else{
            System.out.println("Giriş bilgileriniz Hatalı !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz (evet/hayır): ");
            questions = input.nextLine();
            if (questions.equals("evet")){
                System.out.print("Lütfen yeni şifrenizi giriniz (Şifreniz bir öncekinden farklı olmalıdır!): ");
                newpassword = input.nextLine();
                if (newpassword.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Yeni şifre oluşturuldu.");
                }

            }else {
                System.out.print("Program sonlandırıldı!");
            }
        }
    }
}
