package Pertemuan2;

public class ManipulasiString {

    public static void ubahTeks(String teks1, String teks2) {
        System.out.println("String a menjadi : " + teks1.toLowerCase());
        System.out.println("String b menjadi : " + teks2.toUpperCase());
    }

    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        System.out.println();
        ubahTeks(a, b);
    }
}
