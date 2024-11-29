public class Kafe06 {
    public static void main(String[] args) {
        Menu("Gilang", true, "DISKON50");
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
        System.out.println("Silahkan pilih menu yaNg anda inginkan :)");
    }
}