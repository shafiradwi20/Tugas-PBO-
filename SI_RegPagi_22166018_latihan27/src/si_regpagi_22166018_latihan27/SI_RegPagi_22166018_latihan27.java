 /*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Huruf Besar Kecil
*/
package si_regpagi_22166018_latihan27;

import java.util.Scanner;

public class SI_RegPagi_22166018_latihan27 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();

        System.out.println("----Hasil Formatting----");
        System.out.println("Huruf Besar : " + uppercase);
        System.out.println("Huruf Kecil : " + lowercase);
    }
}
