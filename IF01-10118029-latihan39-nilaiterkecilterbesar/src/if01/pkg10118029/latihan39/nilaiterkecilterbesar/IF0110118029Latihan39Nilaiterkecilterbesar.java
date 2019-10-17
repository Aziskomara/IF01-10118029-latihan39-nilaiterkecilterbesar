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
 * Deskripsi program : Program ini menampilkan nilai terkecil dan terbesar
 * 
 */
public class IF0110118029Latihan39Nilaiterkecilterbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        nilaikecilbesar nilaikecilbesar = new nilaikecilbesar();
        String user;
        int jumlahMhs;

        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama user: ");
        user = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        jumlahMhs = scanner.nextInt();
        System.out.println();
        
        nilaikecilbesar.input(jumlahMhs);
        System.out.println();
        nilaikecilbesar.tampil(jumlahMhs);
        
        nilaikecilbesar.tentuBesarKecil(jumlahMhs);
        
        System.out.println("%nNilai terbesar adalah : " + nilaikecilbesar.besar);
        System.out.println("Nilai terkecil adalah : " + nilaikecilbesar.kecil);
        System.out.println("%nPetugas\t: " + user);
    }
    
}
