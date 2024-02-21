import java.util.Scanner;

public class Perulangan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input NIM:");
        String nim = scanner.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("N = " + n);
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewatkan angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
