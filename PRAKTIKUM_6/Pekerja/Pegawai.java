/* 
 * Nama File    : Pegawai.java
 * Deskripsi    : Super Class Representasi Pegawai
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Pekerja;

public class Pegawai {
    // atribut
    private String nama;
    private int gajiPokok = 5000000;

    // konstruktor
    public Pegawai(String nama){
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Gaji Pokok  : "+ this.gajiPokok);
    }
}
