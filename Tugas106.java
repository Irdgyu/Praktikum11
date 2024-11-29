import java.util.Scanner;
public class Tugas106 {
    public static void main(String[] args) {
        int sisi = inputSisi();
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        output(sisi, volume, luasPermukaan);
    }
    public static int inputSisi() {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        int sisi = input6.nextInt();
        return sisi;
    }
    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan;
    }
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static void output(int sisi, int volume, int luasPermukaan) {
        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
