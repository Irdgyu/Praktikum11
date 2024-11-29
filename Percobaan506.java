import java.util.Scanner;
public class Percobaan506 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input6.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input6.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input6.nextInt();
        L = hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah: " + L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah: " + vol);
    }
    public static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    public static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }
}
