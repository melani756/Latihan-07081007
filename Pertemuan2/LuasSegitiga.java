package Pertemuan2;

public class LuasSegitiga {
    public static void main(String[] args) {
        
        double a = 6;
        double b = 8;
        double luas = 0.5 * a * b;
        System.out.println("Luas Segitiga: " + luas);
        
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Nilai sisi c (sisi miring): " + c);
        
        double keliling = a + b + c;
        System.out.println("Keliling Segitiga: " + keliling);
    }
}