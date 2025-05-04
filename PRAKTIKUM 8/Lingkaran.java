// package PRAKTIKUM 8;
/* 
 * Nama File    : Lingkaran.java
 * Deskripsi    : Representasi kelas Lingkaran yang merupakan child class dari Bangun Datar
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
