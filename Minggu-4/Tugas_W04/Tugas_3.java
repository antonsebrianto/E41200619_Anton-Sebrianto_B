package Tugas_W04;

/**
 *
 * @author Anton
 */
import java.util.Scanner; 
public class Tugas_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] arr; 
        int n, max, min, sum = 0, count = 0; 
        int avg = 0; 

        System.out.print("Masukkan banyaknya data nilai : ");
        n = sc.nextInt(); 
        arr = new int[n]; 
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");            
            arr[i] = sc.nextInt();
        }

        max = arr[0]; 
        min = arr[0]; 
        for(int i=0;i<arr.length;i++){
            sum += arr[i]; 
            count++; 
            if(arr[i] > max){ 
                max = arr[i];
            }else if(arr[i] < min){ 
                min = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Nilai minimum  = " + min); 
        System.out.println("Nilai maksimum  = " + max); 

        avg = sum / count; 
        System.out.println("Nilai rata ratanya adalah = " + avg); 
    }
}
