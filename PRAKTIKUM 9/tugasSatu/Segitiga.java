// package 3.4;
/* 
 * Nama File    : Segitiga.java
 * Deskripsi    : Representasi kelas Segitiga yang merupakan child class dari Bangun Datar
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Jumat, 9 Mei 2025
 */

// import java.math.*;

public class Segitiga extends BangunDatar2{
    // atribut
    private double sisi; //asumsi segitiga yang dibuat adalah segitiga sama sisi
        
    // konstruktor
    public Segitiga(double sisi){
        this.sisi = sisi;
    }
    
    // methode
    @Override
    public double hitungKeliling(){
        return 3*sisi;
    }
    
    @Override
    public double hitungLuas(){
        double tinggi = (sisi)*(Math.sqrt(3)/2); // mencari tinggi menggunakan perbandingan sudut istimewa phytagoras
        return (sisi*tinggi)/2;
    }

    
}
