package pertemuan3;

import java.util.Scanner;
import java.io.*;

public class ScannerBufferReader {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur (Scanner): ");
        int umur = scanner.nextInt(); 
        System.out.println("Umur Anda: " + umur);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan tahun lahir (BufferedReader): ");
        String temp = br.readLine();
        int tahunLahir = Integer.parseInt(temp); 
        System.out.println("Tahun Lahir Anda: " + tahunLahir);

    }
}
