package Pertemuan2;

public class PythagorasKeliling {
    
    public static double cariSisiC(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public static double cariKeliling(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        double a = 6;
        double b = 8;
       
        double c = cariSisiC(a, b);
        double keliling = cariKeliling(a, b, c);
        
        System.out.println();
        System.out.println("Nilai c (Sisi Miring) = " + c);
        System.out.println("Keliling Segitiga     = " + keliling);
    }
}