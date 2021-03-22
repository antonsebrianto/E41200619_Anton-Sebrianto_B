package Tugas_2;
import java.util.Scanner;
/**
 *
 * @author Anton
 */
public class Tugas_4 {
    public static void main(String[] args) {

        Scanner beli = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                     Anton Sebrianto Mall < ASM >");
        System.out.println("                       Promo Belanja Berhadiah");
        System.out.println("                      Khusus Pembelian 5 Pertama");
        System.out.println("                   Dengan Harga Minimum Rp 10.000,00");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Masukan nama pembeli : ");
        String name = beli.nextLine();
        
        int[] brg = new int[5];
        int total = 0;
        for (int i = 0; i < brg.length; i++) {
            System.out.print("Masukan harga barang ke-" + (i+1) + " : ");
            brg[i] = beli.nextInt();
            total = total + brg[i];
        }

        System.out.println("Total harga pembelian atas nama " + name + " adalah Rp. " + total);
        
        boolean promo = false;
        for (int i = 0; i < brg.length; i++) {
            promo = brg[i] >= 10000;
        }

        if (promo == true) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah gelas cantik");
        } else {
            System.out.println("anda tidak mendapat promo");
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                             Terima Kasih");
        System.out.println("              Anda sudah berbelanja di Anton Sebrianto Mall");

    }
}
