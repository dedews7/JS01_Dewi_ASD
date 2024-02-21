public class Fungsi07 {
    static int stokBunga[][] = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
    static String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {
        for (int i = 0; i < stokBunga.length; i++) { //Soal 1
            System.out.println("Pendapatan RoyalGarden " + (i+1) + " adalah : " + pendapatan(i));
        }

        kurangiBunga(3); //Soal 2
        System.out.println("\nJumlah stok RoyalGarden 4 setelah  Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.");
        for (int j = 0; j < stokBunga.length; j++) {
            System.out.println(namaBunga[j] + " : " + stokBunga[3][j]);
        }
    }

    static int pendapatan(int i){
        int total = (stokBunga[i][0] * 75000) + (stokBunga[i][1] * 50000) + 
        (stokBunga[i][2] * 60000) + (stokBunga[i][3] * 10000);
        return total;
    }

    static void kurangiBunga(int cabang) {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int j = 0; j < stokBunga[cabang].length; j++) {
            stokBunga[cabang][j] += bungaMati[j];
        }
    }
}