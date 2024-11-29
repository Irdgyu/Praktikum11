import java.util.Scanner;
public class Kafe06 {
    public static void main(String[] args) {
        Menu("Gilang", true, "DISKON50");
        penerimaUcapan(true); 
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon tambahan 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("WAH, Anda berhak mendapatkan diskon tambahan sebesar 50%. Selamat !!!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("WAH, Anda berhak mendapatkan diskon tambahan sebesar 30%. Selamat !!!");
        } else {
            System.out.println("Mohon maaf, kode invalid :(");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp.15000");
        System.out.println("2. Cappuccino - Rp.20000");
        System.out.println("3. Latte - Rp.22000");
        System.out.println("4. Teh Tarik - Rp.12000");
        System.out.println("5. Roti Bakar - Rp.10000");
        System.out.println("6. Mie Goreng - Rp.18000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan :)");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo, boolean isMember) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (isMember) {
            System.out.println("\nDiskon tambahan 10% untuk member diterapkan!");
            hargaTotal *= 0.9; 
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Berhasil, Anda mendapatkan tambahan diskon 50% dari kode promo!");
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Berhasil, Anda mendapatkan tambahan diskon 30% dari kode promo!");
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon tambahan yang diterapkan.");
        }
        return hargaTotal;
    }
    public static void penerimaUcapan(boolean isMember) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = input6.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = input6.nextInt();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = input6.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo, isMember);
        System.out.println("Total harga untuk pesanan Anda: Rp." + totalHarga);
        input6.close();
    }
}
