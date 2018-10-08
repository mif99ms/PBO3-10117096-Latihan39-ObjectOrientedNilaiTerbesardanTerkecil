/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan39.objectorientednilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program perhitungan nilai terbesar dan 
 * terkecil
 */
public class PBO310117096Latihan39ObjectOrientedNilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Petugas ptg = new Petugas();
        DaftarNilai dafNilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptg.namaPetugas);
    }
    
}
