/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Ganti Kata
*/
package si_regpagi_22166018_latihan28;

import java.util.Scanner;

public class SI_RegPagi_22166018_latihan28 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        System.out.print("Ganti Kata: ");
        String oldWord = input.next();

        System.out.print("Menjadi Kata: ");
        String newWord = input.next();

        String newSentence = sentence.replaceAll(oldWord, newWord);

        System.out.println("----Hasil Formatting----");
        System.out.println("Kalimat awal: " + sentence);
        System.out.println("Kalimat baru: " + newSentence);
    }
}
