import java.util.Scanner;
public class TugasIndividu1_16 {

    public static void main(String[] args) {

        int jarak;

        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukkan Jarak : ");
        jarak = input16.nextInt();

        if (jarak <= 5) {
            System.out.println("Menggunakan Melee Weapon");
        } else if (jarak >= 5 && jarak <= 1000) {
            System.out.println("Menggunakan Ranged Weapon");
        } else {
            System.out.println("Jarak di luar rentang pertarungan.");
        }
    }
}
