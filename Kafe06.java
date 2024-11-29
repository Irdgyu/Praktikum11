import java.util.Scanner;
public class Kafe06 {
    public static void main(String[] args) {
        Menu("Gilang", true, "DISKON50");
        penerimaUcapan(true, "DISKON50");
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("\nSelamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan tambahan diskon sebesar 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("WAH, Anda berhak mendapatkan tambahan diskon sebesar 50%. Selamat !!!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("WAH, Anda berhak mendapatkan tambahan diskon sebesar 30%. Selamat !!!");
        } else {
            System.out.println("Mohon maaf, kode invalid :(");
        }
        System.out.println("\n==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp.15000");
        System.out.println("2. Cappuccino - Rp.20000");
        System.out.println("3. Latte - Rp.22000");
        System.out.println("4. Teh Tarik - Rp.12000");
        System.out.println("5. Roti Bakar - Rp.10000");
        System.out.println("6. Mie Goreng - Rp.18000");
        System.out.println("=========================");
    }
    public static int hitungHargaTanpaDiskon(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    public static void penerimaUcapan(boolean isMember, String kodePromo) {
        Scanner input = new Scanner(System.in);
        int totalTanpaDiskon = 0;
        System.out.println("Silahkan pilih menu. Tekan angka '0' jika selesai memilih menu!");
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = input.nextInt();
            if (pilihanMenu == 0) {
                break;
            }
            System.out.print("Masukkan jumlah pesanan untuk menu ini: ");
            int banyakItem = input.nextInt();
            totalTanpaDiskon += hitungHargaTanpaDiskon(pilihanMenu, banyakItem);
        }
        System.out.println("Total keseluruhan sebelum diskon: Rp." + totalTanpaDiskon);
        double totalSetelahDiskonMember = isMember ? totalTanpaDiskon * 0.9 : totalTanpaDiskon;
        if (isMember) {
            System.out.println("Tambahan diskon sebesar 10% untuk member diterapkan!");
        }
        System.out.println("Total setelah diskon member: Rp." + (int) totalSetelahDiskonMember);
        double totalSetelahDiskonPromo = totalSetelahDiskonMember;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalSetelahDiskonPromo *= 0.5;
            System.out.println("Berhasil, Anda mendapatkan tambahan diskon sebesar 50% dari kode promo. Selamat !!!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalSetelahDiskonPromo *= 0.7;
            System.out.println("Berhasil, Anda mendapatkan tambahan diskon sebesar 30% dari kode promo. Selamat !!!");
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon tambahan yang diterapkan.");
        }
        System.out.println("Total setelah diskon kode promo: Rp." + (int) totalSetelahDiskonPromo);
        System.out.println("\n=====================================");
        System.out.println("Total yang harus dibayar: Rp." + (int) totalSetelahDiskonPromo);
        System.out.println("=====================================");
        input.close();
    }
}
