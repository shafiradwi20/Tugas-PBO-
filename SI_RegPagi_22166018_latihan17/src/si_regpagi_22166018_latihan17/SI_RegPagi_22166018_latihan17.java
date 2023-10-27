/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Gaji Karyawan
*/
package si_regpagi_22166018_latihan17;
import java.util.Scanner;
public class SI_RegPagi_22166018_latihan17 {
    public static void main(String[] args) {

        // Gaji pokok Younglex
        double gajiPokok = 6000000.0; // Gaji pokok Younglex sebesar Rp 6.000.000

        // Status perkawinan Younglex (true jika sudah menikah, false jika belum)
        boolean menikah = true;

        // Persentase tunjangan untuk yang sudah menikah
        double persentaseTunjangan = 36.0; // 36% tunjangan

        // Menghitung tunjangan berdasarkan status perkawinan
        double tunjangan = 0.0;
        if (menikah) {
            tunjangan = (persentaseTunjangan / 100) * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("Gaji Pokok Younglex: Rp " + gajiPokok);
        System.out.println("Tunjangan Younglex: Rp " + tunjangan);
        System.out.println("Total Gaji Younglex: Rp " + totalGaji);
    }
}

   
   
    
