package Pertemuan4;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi = " + (sisi * sisi));
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas Segitiga = " + (0.5 * alas * tinggi));
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran = " + (3.14 * r * r));
                break;
            case 4:
                System.out.print("Masukkan sisi sejajar a: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi sejajar b: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Trapesium = " + (0.5 * (a + b) * t));
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang = " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
