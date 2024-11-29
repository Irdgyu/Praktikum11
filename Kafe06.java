public class Kafe06 {
    public static void main(String[] args) {
        Menu("Andi", true);
    }
    public static void Menu(String namaPelanggan,boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp.15000");
        System.out.println("2. Cappuccino - Rp.20000");
        System.out.println("3. Latte - Rp.22000");
        System.out.println("4. Teh Tarik - Rp.12000");
        System.out.println("5. Roti Bakar - Rp.10000");
        System.out.println("6. Mie Goreng- Rp.18000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu ynag anda inginkan :)");
    }

}