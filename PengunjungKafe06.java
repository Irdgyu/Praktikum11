public class PengunjungKafe06 {
    public static void main(String[] args) {
        daftarPengunjung("Gilang", "Rifky", "Hanif");
    }
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
}
