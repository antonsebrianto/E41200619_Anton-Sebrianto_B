package Tugas_2;
import java.util.Scanner;
/**
 *
 * @author Anton
 */
public class Tugas_5 {
    public static void main(String[] args) {

        Scanner beli = new Scanner(System.in);
        System.out.println("                    Cafe Anton");
        System.out.println("                   Aneka Minuman");
        System.out.println("--------------------------------------------------");
        System.out.println("                      SPECIAL MENU");
        System.out.println("1. Soft Drinks");
        System.out.println("2. Mix Juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda Milk");
        System.out.println("5. Tea");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukan nama pembeli : ");
        String name = beli.nextLine();
        System.out.print("Silahkan masukan pilihan anda : ");

        int choice = beli.nextInt();
        String pilihan = "";

        switch (choice) {
            case 1:
                pilihan = "Soft Drinks";
                break;
            case 2:
                pilihan = "Mix Juice";
                break;
            case 3:
                pilihan = "Nescafe";
                break;
            case 4:
                pilihan = "Soda Milk";
                break;
            case 5:
                pilihan = "Tea";
                break;
            default:
                System.out.println("Pilihan anda tidak terdaftar di menu");
                break;
        }

        System.out.println("Minuman yang anda pesan adalah : " + pilihan);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + name + " telah berkunjung di Cafe Anton");

    }
}
