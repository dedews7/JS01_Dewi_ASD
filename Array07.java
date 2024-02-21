import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("======== Program Menghitung IP Semester ========");
        int jumlahMataKuliah = 9;
        double totalBobotSKS = 0;
        double totalBobotSKSxNilai = 0;
    
        double[] nilaiAngka = new double[jumlahMataKuliah];
        int[] bobotSKS = new int[jumlahMataKuliah];
        String[] namaMataKuliah = {
            "Agama",
            "Konsep Teknologi Informasi",
            "Critical Thinking & Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Pengantar Akuntansi dan Manajemen Bisnis",
            "Bahasa Indonesia"
        };
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("\nMasukkan bobot SKS Mata Kuliah " + namaMataKuliah[i] + ": ");
            bobotSKS[i] = scanner.nextInt();
            System.out.print("Masukkan nilai Angka untuk MK " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }
        
        System.out.println("=================================================");
        System.out.println("\n============Hasil Konversi Nilai===============");
        System.out.println("=================================================");
        System.out.println("Mata Kuliah\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            double nilaiSetara = 0;
            String nilaiHuruf = "";
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiSetara = 4.0;
                nilaiHuruf = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiSetara = 3.5;
                nilaiHuruf = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiSetara = 3.0;
                nilaiHuruf = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiSetara = 2.5;
                nilaiHuruf = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiSetara = 2.0;
                nilaiHuruf = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiSetara = 1.0;
                nilaiHuruf = "D";
            } else {
                nilaiSetara = 0;
                nilaiHuruf = "E";
            }
            System.out.printf("%-40s%-15.2f%-15s%-10.2f\n" , namaMataKuliah[i], nilaiAngka[i], nilaiHuruf, nilaiSetara);
            
            totalBobotSKS += bobotSKS[i];
            totalBobotSKSxNilai += (nilaiSetara * bobotSKS[i]);
        }
        
        double IPSemester = totalBobotSKSxNilai / totalBobotSKS;
        System.out.println("\nIP: " + String.format("%.2f", IPSemester));
        scanner.close();
    }
}
