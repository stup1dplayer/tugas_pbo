/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author afkar
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih;

        // MENU
        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        pilih = scanner.nextInt();

        while (pilih != 0) {
            if (pilih == 1) {
                // PERSEGI
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                System.out.println();
                persegi persegi = new persegi(sisi);
                persegi.hitungluas();
                persegi.hitungkeliling();
                persegi.ingfo();
            } else if (pilih == 2) {
                // PERSEGI PANJANG
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                System.out.println();
                persegipanjang persegip = new persegipanjang(panjang, lebar);
                persegip.hitungluas();
                persegip.hitungkeliling();
                persegip.ingfo();
            } else if (pilih == 3) {
                // SEGITIGA
                System.out.print("Masukkan panjang alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.println();
                segitiga segitiga = new segitiga(alas, tinggi);
                segitiga.hitungluas();
                segitiga.hitungkeliling();
                segitiga.ingfo();
            } else if (pilih == 4) {
                // LINGKARAN
                System.out.print("Masukkan tinggi jejari: ");
                double jejari = scanner.nextDouble();
                System.out.println();
                lingkaran lingkaran = new lingkaran(jejari);
                lingkaran.hitungluas();
                lingkaran.hitungkeliling();
                lingkaran.ingfo();
            } else {
                // SELAIN 0-4
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

            // MENU SETELAH PILIH
            System.out.println();
            System.out.println("Pilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilih = scanner.nextInt();
        }

        // KELUAR
        System.out.println("Terima kasih! Program selesai.");
        scanner.close();
    }
}