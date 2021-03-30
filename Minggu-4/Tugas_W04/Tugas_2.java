package Tugas_W04;

/**
 *
 * @author Anton
 */
public class Tugas_2 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 100;
        System.out.println("          Do__While           ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("=============================");
        do {
            System.out.print(awal + " ");
            awal*=2;
        }while (awal <= akhir);
        
    }
}
