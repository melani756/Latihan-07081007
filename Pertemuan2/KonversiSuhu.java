package Pertemuan2;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        double C_to_F = (C * 9/5) + 32;
        double F_to_C = (F - 32) * 5/9;
        System.out.println("10 Celcius ke Fahrenheit: " + C_to_F);
        System.out.println("15 Fahrenheit ke Celcius: " + F_to_C);

        double C_to_R = C * 4/5;
        double R_to_C = R * 5/4;
        System.out.println("10 Celcius ke Reamur: " + C_to_R);
        System.out.println("5 Reamur ke Celcius: " + R_to_C);

        double F_to_R = (F - 32) * 4/9;
        double R_to_F = (R * 9/4) + 32;
        System.out.println("15 Fahrenheit ke Reamur: " + F_to_R);
        System.out.println("5 Reamur ke Fahrenheit: " + R_to_F);
    }
}