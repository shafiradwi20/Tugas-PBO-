/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Deskripsi : Waktu Saat Ini
*/
package si_regpagi_22166018_latihan26;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SI_RegPagi_22166018_latihan26 {
    public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
}
