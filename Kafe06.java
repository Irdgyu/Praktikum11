import java.util.Scanner;
public class Kafe06 {
    public static void main(String[] args) {
        Menu("Gilang", true, "DISKON50");
        hitungTotalHarga(6, 1);
        penerimaUcapan();
    }
    public static void Menu(String namaPelanggan,boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("WAH, Anda berhak mendapatkan diskon tambahan sebesar 50%. Selamat !!!");
        }else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("WAH, Anda berhak mendapatkan diskon tambahan sebesar 30%. Selamat !!!");
        }else {
            System.out.println("Mohon maaf, kode invalid :(");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp.15000");
        System.out.println("2. Cappuccino - Rp.20000");
        System.out.println("3. Latte - Rp.22000");
        System.out.println("4. Teh Tarik - Rp.12000");
        System.out.println("5. Roti Bakar - Rp.10000");
        System.out.println("6. Mie Goreng- Rp.18000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan :)");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static int penerimaUcapan() {
        Scanner input6 = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = input6.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = input6.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda: Rp." + totalHarga);
        return totalHarga;
    }
}