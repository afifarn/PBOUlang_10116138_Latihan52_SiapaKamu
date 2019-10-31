/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan52_siapakamu;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Siapa Kamu
 */
public class PBOUlang_10116138_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNIP("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN = " + dosen.getNIP());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM("10116138");
        mhs.setNama("Afif Raditya Nugraha");
        mhs.setUmur(20);
        mhs.setKelas("PBOUlang/IF4");
        System.out.println("NIM MAHASISWA = " + mhs.getNIM());
        mhs.siapaKamu();
        mhs.kelasApa();

    }
    
}
