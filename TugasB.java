import java.util.Scanner;

public class TugasB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");

        if (scanner.hasNextInt()) {
            int usia = scanner.nextInt();

            if (usia < 0) {
                System.out.println("Usia tidak boleh negatif. Silakan masukkan angka positif.");
            } else {

                String kategori;
                if (usia >= 0 && usia <= 12) {
                    kategori = "Anak";
                } else if (usia >= 13 && usia <= 19) {
                    kategori = "Remaja";
                } else if (usia >= 20 && usia <= 64) {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }
                System.out.println("Kategori usia Anda: " + kategori);
            }
        } else {
            System.out.println("Input tidak valid. Silakan masukkan angka positif.");
        }
    }
}
