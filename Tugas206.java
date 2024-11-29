public class Tugas206 {
    static int[][] dataPenjualan = {
            {20, 20, 25, 20, 10, 60, 10}, // Kopi
            {30, 80, 40, 10, 15, 20, 25}, // Teh
            {5, 9, 20, 5, 9, 5, 45},      // Es Degan
            {50, 8, 17, 18, 10, 30, 6},   // Roti Bakar
            {15, 10, 16, 15, 10, 10, 55}  // Gorengan
    };
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
    public static void main(String[] args) {
        tampilkanDataPenjualan();
        tampilkanMenuTertinggi();
        tampilkanRataRataPenjualan();
    }
    public static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan:");
        System.out.printf("%-12s", "");
        for (String h : hari) {
            System.out.printf("%-8s", h); 
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-12s", menu[i]); 
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.printf("%-8d", dataPenjualan[i][j]); 
            }
            System.out.println();
        }
    }
    public static void tampilkanMenuTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int penjualan : dataPenjualan[i]) {
                total += penjualan;
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi + " : " + maxPenjualan);
    }
    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan: ");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int penjualan : dataPenjualan[i]) {
                total += penjualan;
            }
            int rataRata = total / dataPenjualan[i].length;
            System.out.printf("%-12s: %d\n", menu[i], rataRata);
        }
    }
}
