package Pertemuan2;

public class WaktuTempuh{
    public static void main(String[] args) {
        long jarakBulanKm = 384400;
        long jarakMatahariKm = 152100000;
        int kecepatanCahaya = 300000;
        
        double waktuKeBulan = (double) jarakBulanKm / kecepatanCahaya;
        double waktuKeMatahari = (double) jarakMatahariKm / kecepatanCahaya;
        
        System.out.println("Waktu tempuh bumi ke bulan: " + waktuKeBulan + " detik");
        System.out.println("Waktu tempuh bumi ke matahari: " + waktuKeMatahari + " detik");
    }
}