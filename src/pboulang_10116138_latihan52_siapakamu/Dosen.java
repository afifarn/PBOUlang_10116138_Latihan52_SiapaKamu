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
public class Dosen extends Manusia{
    private String NIP;
    private String mataKuliah;

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Nama Saya "+nama+" umur "+umur+
                           " tahun sedang mengajar mata kuliah "+mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }

}
