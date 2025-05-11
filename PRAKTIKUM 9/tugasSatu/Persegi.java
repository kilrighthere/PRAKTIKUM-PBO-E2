// package 3.4;

/* 
 * Nama File    : Persegi.java
 * Deskripsi    : Representasi kelas Persegi yang merupakan child class dari Bangun Datar
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Jumat, 9 Mei 2025
 */

public class Persegi extends BangunDatar2{
    // atribut
    private double sisi;

    // konstruktor
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    // methode
    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }

    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
