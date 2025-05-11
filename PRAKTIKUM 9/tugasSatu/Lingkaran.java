// package PRAKTIKUM 8;
/* 
 * Nama File    : Lingkaran.java
 * Deskripsi    : Representasi kelas Lingkaran yang merupakan child class dari Bangun Datar
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Jumat, 9 Mei 2025
 */


public class Lingkaran extends BangunDatar2 {
    // atribut
    private double jejari;

    // konstruktor
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    // methode
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }

    // methode
    @Override
    public double hitungLuas(){
        return jejari*jejari*3.14;
    }
}
