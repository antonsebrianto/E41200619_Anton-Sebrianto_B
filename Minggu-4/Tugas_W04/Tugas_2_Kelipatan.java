package Tugas_W04;

/**
 *
 * @author Anton
 */
public class Tugas_2_Kelipatan {
    public static void main(String[] args) {
        int awal = 0;
        int akhir = 100;
        System.out.println("          Do__While           ");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("=============================");
        do {
            System.out.print(awal + " ");
            awal+=2;
        }while (awal <= akhir);
        
    }
}
