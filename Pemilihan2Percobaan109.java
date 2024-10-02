import java.util.Scanner;
/**
 * Pemilihan2Percobaan109
 */
public class Pemilihan2Percobaan109 {
    public static void main(String[] args) {
        
    Scanner input09 = new Scanner (System.in);

    System.out.print("Masukkan tahun: ");
    int tahun = input09.nextInt();
    
    if (tahun % 4 == 0 && tahun % 100 != 0){
            System.out.println("Tahun Kabisat");
    } else 
            System.out.println("Bukan tahun kabisat");
    }

    
}