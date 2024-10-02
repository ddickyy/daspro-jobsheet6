import java.util.Scanner;
/**
 * TugasMinggu6
 */
public class TugasMinggu6 {

    public static void main(String[] args) {
    
        Scanner input09 = new Scanner (System.in);
        double diskon, total_bayar;
        String jenis_buku;
        int pembelian, harga = 20000;

        System.out.print("Masukkan jenis buku = ");
        jenis_buku = input09.nextLine();
        System.out.print("Masukkan jumlah pembelian = ");
        pembelian = input09.nextInt();

        if (jenis_buku.equalsIgnoreCase("kamus")) {
            if (pembelian > 2) 
                diskon = 0.12;
            else 
                diskon = 0.1;
        } else if (jenis_buku.equalsIgnoreCase("novel")) {
            if (pembelian > 3) 
                diskon = 0.09;
            else 
                diskon = 0.07;
        } else if (pembelian > 3) {
            diskon = 0.05;
        }
            else 
            diskon = 0;
        total_bayar = harga*pembelian - (harga * diskon);
        System.out.println("Total bayar Anda = Rp" + total_bayar);
    }
}