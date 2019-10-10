/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan23nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 23
 */
public class PBOULG10115557Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String petugas;
        int nMhs, nilaiBesar, nilaiKecil, nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        nilaiBesar = 0;
        nilaiKecil = 100;

        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scn.nextInt();
            
            nilaiBesar = ((nilaiBesar<=nilaiMhs)?nilaiMhs:nilaiBesar);
            nilaiKecil = ((nilaiKecil>=nilaiMhs)?nilaiMhs:nilaiKecil);
        }
        
        System.out.print("\nNilai Terbesar adalah : "+ nilaiBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nilaiKecil);
        System.out.println("");
        System.out.println("Petugas : " + petugas);
    }
    
}