package Tugas_W04;
import java.util.Scanner;
/**
 *
 * @author Anton
 */
public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int genap;
        int genap1;
        System.out.println("Masukkan batas nilai awal = ");
        genap = input.nextInt();
        System.out.println("Masukkan batas nilai akhir = ");
        genap1 = input.nextInt();
        for (int i = genap; i <= genap1; i++) {
            if (i % 2 == 0){
            System.out.print(i + " ");
            }
        }
    }
}
