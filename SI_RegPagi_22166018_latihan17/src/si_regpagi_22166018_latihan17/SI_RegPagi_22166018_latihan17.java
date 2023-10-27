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
        

        Scanner input = new Scanner(System.in);

        // Memasukkan gaji pokok
        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = input.nextDouble();

        // Memasukkan status pernikahan
        System.out.print("Apakah Anda sudah menikah? (true/false): ");
        boolean menikah = input.nextBoolean();

        // Menghitung tunjangan berdasarkan aturan
        double tunjangan = 0;
        if (menikah) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + totalGaji);
    }
}

   
    

