import java.util.Scanner;
public class Tugas306 {
    static Scanner input6 = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] nilai = inputNilai();
        String[] namaMahasiswa = inputNamaMahasiswa(nilai.length);
        tampilkanDataNilai(namaMahasiswa, nilai);
        tampilkanRataRataNilaiMahasiswa(namaMahasiswa, nilai);
        tampilkanRataRataNilaiTugas(nilai);
    }
    public static int[][] inputNilai() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input6.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input6.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];
        System.out.println("\nMasukkan nilai tugas mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j + 1) + " mahasiswa ke-" + (i + 1) + ": ");
                nilai[i][j] = input6.nextInt();
            }
        }
        return nilai;
    }
    public static String[] inputNamaMahasiswa(int jumlahMahasiswa) {
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        System.out.println("\nMasukkan nama mahasiswa:");
        input6.nextLine();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input6.nextLine();
        }
        return namaMahasiswa;
    }
    public static void tampilkanDataNilai(String[] namaMahasiswa, int[][] nilai) {
        System.out.println("\nData Nilai Mahasiswa:");
        System.out.printf("%-15s", "Nama Mahasiswa");
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.printf("Tugas %d\t", i + 1);
        }
        System.out.println();
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-15s", namaMahasiswa[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("%-8d\t", nilai[i][j]);
            }
            System.out.println();
        }
    }
    public static void tampilkanRataRataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilai) {
        System.out.println("\nRata-rata nilai setiap mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            int rataRata = total / nilai[i].length;
            System.out.printf("%-15s: %d\n", namaMahasiswa[i], rataRata);
        }
    }
    public static void tampilkanRataRataNilaiTugas(int[][] nilai) {
        System.out.println("\nRata-rata nilai setiap tugas:");
        for (int j = 0; j < nilai[0].length; j++) {
            int total = 0;
            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i][j];
            }
            int rataRata = total / nilai.length; // Menggunakan pembagian integer
            System.out.printf("Tugas %d: %d\n", j + 1, rataRata);
        }
    }
}

