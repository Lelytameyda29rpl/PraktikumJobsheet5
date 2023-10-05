import java.util.Scanner;
public class TugasIndividu2_16 {

    public static void main(String[] args) {

        String username_benar = "lelyta123";
        String password_benar = "password123";

        Scanner input16 = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        username_benar = input16.nextLine();

        System.out.print("Masukkan password: ");
        password_benar = input16.nextLine();

        if (username_benar.equals(username_benar) && password_benar.equals(password_benar)) {
            System.out.println("Selamat datang, " + username_benar + "!");
        } else {
            System.out.println("Username dan password salah. Silakan coba lagi.");
        }

      
    }
    
}
