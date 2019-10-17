/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan39.nilaiterkecilterbesar;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan nilai terbesar dan terkecil
 * 
 */
public class nilaikecilbesar {
    Scanner scanner = new Scanner(System.in);

    int jumlahMhs;
    int nilai[] = new int[10];
    double besar, kecil;

    public void input(int jumlahMhs) {

        for (int i = 0; i <= (jumlahMhs - 1); i++) {

            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilai[i] = scanner.nextInt();

        }

    }

    public void tampil(int jmlMhs) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 0; i <= jmlMhs - 1; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
        }
    }

    public void tentuBesarKecil(int jmlMhs) {
        int i = 0;
        besar = nilai[i];
        kecil = nilai[i];
        for (i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
            
            if (nilai[i] > besar) {
                besar = nilai[i];
            }
            if (nilai[i] < kecil) {
                kecil = nilai[i];
            }
        }
    }
}
