/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Saldo Tabungan
*/
package si_regpagi_22166018_latihan19;
public class SI_RegPagi_22166018_latihan19 {
    public static void main(String[] args) {
      // Inisialisasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lamaBulan = 6;
        
        // Hitung saldo akhir setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double saldoAkhir = saldoAwal + (saldoAwal * bunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo bulan ke-%d: Rp%,.2f\n", i, saldoAkhir);
}
        }
    }

    

