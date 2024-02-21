import java.util.Scanner;

public class Pemilihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();

        if (nilaiTugas >= 0 && nilaiTugas <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUTS >= 0 && nilaiUTS <= 100 && nilaiUAS >= 0 && nilaiUAS <= 100) {
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            
            String nilaiHuruf;
            String keterangan;

            if (nilaiAkhir > 100 || nilaiAkhir < 0) {
                nilaiHuruf = "Nilai tidak valid";
                keterangan = "";
            } else if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}