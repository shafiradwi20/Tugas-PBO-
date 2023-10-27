/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Perhitungan Lingkaran
*/
package si_regpagi_22166018_latihan22;

import java.util.Scanner;
public class SI_RegPagi_22166018_latihan22 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("======Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        double diameter = input.nextDouble();

        if (diameter <= 0) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            return;
        }

        double radius = diameter / 2;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + radius + " cm");
        System.out.println("Luas Lingkaran = " + String.format("%.2f", area) + " cm");
        System.out.println("Keliling Lingkaran = " + String.format("%.2f", circumference) + " cm");
    }
    
}
