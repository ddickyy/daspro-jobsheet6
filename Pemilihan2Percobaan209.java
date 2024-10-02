import java.util.Scanner;
/**
 * Pemilihan2Percobaan209
 */
public class Pemilihan2Percobaan209 {

    public static void main(String[] args) {
        
    Scanner input09 = new Scanner (System.in);
    double total_bayar, diskon;
    int harga, pilihan_menu;

    System.out.println("-------------------------");
    System.out.println("===== MENU KAFE JTI =====");
    System.out.println("-------------------------");
    System.out.println("1. Ricebowl");
    System.out.println("2. Ice Tea");
    System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
    System.out.println("-------------------------------------");
    System.out.println("Masukkan angka dari menu yang dipilih = ");
    pilihan_menu = input09.nextInt();
    input09.nextLine();
    System.out.println("Apakah punya member (y/n) = ");
    String member = input09.nextLine();
    System.out.println("-------------------------------------");

    if (member.equalsIgnoreCase("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl =" + harga);

        } else if (pilihan_menu == 2) {
            harga = 30000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        total_bayar = harga - (harga*diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
    else if (member.equalsIgnoreCase("n")) {
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
            
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
        System.out.println("Total bayar Rp" + harga);
    
    } else {
        System.out.println("Member tidak valid");
    } 
    System.out.println("-------------------------------------");

    }
}