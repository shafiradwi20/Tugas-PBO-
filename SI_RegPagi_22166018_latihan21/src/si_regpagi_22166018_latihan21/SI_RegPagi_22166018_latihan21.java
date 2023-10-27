/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Program Rata-rata Nilai
*/
package si_regpagi_22166018_latihan21;

import java.util.Scanner;

public class SI_RegPagi_22166018_latihan21 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nilai[i];
        }

        double average = (double) sum / n;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + average);
    }
}

