/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Nilai Terbesar dan Terkecil
*/
package si_regpagi_22166018_latihan23;

import java.util.Scanner;

public class SI_RegPagi_22166018_latihan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----Program Nilai Terbesar dan Terkecil Nilai Mahasiswa-----");
        System.out.print("Masukkan Nama Petugas : ");
        String name = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("Petugas " + name);
    }
}

