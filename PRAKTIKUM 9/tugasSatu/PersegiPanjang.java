// package 3.4;
/* 
 * Nama File    : PersegiPanjang.java
 * Deskripsi    : Representasi kelas PersegiPanjang yang merupakan child class dari Bangun Datar
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Jumat, 9 Mei 2025
 */

public class PersegiPanjang extends BangunDatar2{
    // atribut
    private double panjang;
    private double lebar;

    // konstruktor
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // methode
    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}
